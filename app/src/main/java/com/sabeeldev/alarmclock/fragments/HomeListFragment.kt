package com.sabeeldev.alarmclock

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import android.view.*
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import com.simplemobiletools.commons.views.MyTextView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import com.sabeeldev.alarmclock.Utils.getDate
import com.sabeeldev.alarmclock.Utils.getFormattedTime
import com.sabeeldev.alarmclock.Utils.getPassedSeconds
import com.sabeeldev.alarmclock.Utils.startAlarmSetupFragment
import com.sabeeldev.alarmclock.activities.MainActivity
import com.sabeeldev.alarmclock.activities.SettingsActivity
import com.sabeeldev.alarmclock.database.Alarm
import com.sabeeldev.alarmclock.fragments.AlarmSetupFragment
import com.sabeeldev.alarmclock.fragments.AllAlarmsFragment
import com.sabeeldev.alarmclock.fragments.ViewCalendarFragment
import java.text.SimpleDateFormat
import java.util.*

class HomeListFragment : Fragment() {

    private lateinit var activity: MainActivity
    private val alarms = ArrayList<Alarm>()
    private val updateHandler = Handler()
    private val ONE_SECOND = 1000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onPause() {
        updateHandler.removeCallbacksAndMessages(null)
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        activity.disposable.clear()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity = this.getActivity() as MainActivity
        Utils.ADAPTER_CHECKER = "main"
        return inflater.inflate(R.layout.fragment_alarms_list, container, false)
    }

    override fun onResume() {
        super.onResume()
        passedSeconds = getPassedSeconds()
        setupRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater?.inflate(R.menu.main_activity_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.menu_activity_main_add -> {
                startAlarmSetupFragment(activity, AlarmSetupFragment(), null, "AlarmSetupFragment")
            }

            R.id.menu_activity_main_settings -> {
                startActivity(Intent(activity, SettingsActivity::class.java))
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun setupRecyclerView() {
        val rvManager = GridLayoutManager(context, 2)
        val rvAdapter = AlarmsRWAdapter(alarms, activity)

        loadAlarmsIntoRV(rvAdapter)

        view?.findViewById<RecyclerView>(R.id.all_alarms_recycler_view)?.apply {
            addItemDecoration(
                DividerItemDecoration(
                    context,
                    rvManager.orientation
                )
            )
            layoutManager = rvManager
            adapter = rvAdapter
        }

        view?.findViewById<TextView>(R.id.view_all)?.setOnClickListener {
            startAlarmSetupFragment(activity, AllAlarmsFragment(), null, "AllAlarmsFragment")
        }
        view?.findViewById<TextView>(R.id.tv_date)?.text = getDate()
        view?.findViewById<TextView>(R.id.tv_date)?.setOnClickListener {
            startAlarmSetupFragment(activity, ViewCalendarFragment(), null, "ViewCalendarFragment")
        }
        updateCurrentTime()
    }

    private var passedSeconds = 0

    private fun updateCurrentTime() {
        val hours = (passedSeconds / 3600) % 24
        val minutes = (passedSeconds / 60) % 60
        val seconds = passedSeconds % 60
        view?.findViewById<MyTextView>(R.id.simpleDigitalClock)?.text =
            requireContext().getFormattedTime(
                passedSeconds,
                false,
                true
            )
        view?.findViewById<MyTextView>(R.id.simpleDigitalClock)?.textSize =
            resources.getDimension(R.dimen.clock_text_size_smaller) / resources.displayMetrics.density

        if (seconds == 0) {
            if (hours == 0 && minutes == 0) {
                view?.findViewById<TextView>(R.id.tv_date)?.text = getDate()
            }
        }
        updateHandler.postDelayed({
            passedSeconds++
            updateCurrentTime()
        }, ONE_SECOND)
    }


    private fun loadAlarmsIntoRV(rvAdapter: AlarmsRWAdapter) {

        activity.disposable.add(activity.viewModel.getAlarmList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { list ->
                alarms.clear()
                if (list.isEmpty()) {
                    showAlarmsNotFoundMessage()
                } else {
                    alarms.addAll(list.sortedWith(compareBy({ it.hours }, { it.minutes })))
                    rvAdapter.notifyDataSetChanged()
                }
            })
    }

    private fun showAlarmsNotFoundMessage() {
        view?.findViewById<TextView>(R.id.all_alarms_not_found_text)?.apply {
            visibility = TextView.VISIBLE
            view?.findViewById<RecyclerView>(R.id.all_alarms_recycler_view)?.visibility =
                RecyclerView.GONE
        }
    }
}
