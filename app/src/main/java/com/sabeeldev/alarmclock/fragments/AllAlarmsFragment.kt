package com.sabeeldev.alarmclock.fragments

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import com.sabeeldev.alarmclock.*
import com.sabeeldev.alarmclock.Utils.ADAPTER_CHECKER
import com.sabeeldev.alarmclock.Utils.startAlarmSetupFragment
import com.sabeeldev.alarmclock.activities.MainActivity
import com.sabeeldev.alarmclock.activities.SettingsActivity
import com.sabeeldev.alarmclock.database.Alarm
import java.util.ArrayList

class AllAlarmsFragment : Fragment() {

    private lateinit var activity: MainActivity
    private val alarms = ArrayList<Alarm>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
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
        ADAPTER_CHECKER = "not-main"
        return inflater.inflate(R.layout.fragment_all_alarms, container, false)
    }

    override fun onResume() {
        super.onResume()

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
        val rvManager = LinearLayoutManager(activity)
        val rvAdapter = AlarmsRWAdapter(alarms,activity)

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
