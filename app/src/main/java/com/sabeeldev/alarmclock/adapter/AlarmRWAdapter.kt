package com.sabeeldev.alarmclock

import android.app.AlarmManager
import android.content.Context
import android.os.Bundle
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simplemobiletools.commons.views.MyTextView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import com.sabeeldev.alarmclock.Utils.getFormattedTime
import com.sabeeldev.alarmclock.Utils.startAlarmSetupFragment
import com.sabeeldev.alarmclock.activities.MainActivity
import com.sabeeldev.alarmclock.database.Alarm
import com.sabeeldev.alarmclock.fragments.AlarmSetupFragment
import java.util.ArrayList


class AlarmsRWAdapter(private val allAlarms: ArrayList<Alarm>, val activity: MainActivity) :
    RecyclerView.Adapter<AlarmsRWAdapter.ViewHolder>() {

    class ViewHolder(val layout: RelativeLayout) : RecyclerView.ViewHolder(layout) {
        val name: TextView = layout.findViewById(R.id.alarm_card_name_text_view)
        val time: MyTextView = layout.findViewById(R.id.alarm_card_time_text_view)
        val switch: Switch = layout.findViewById(R.id.alarm_card_switch)
        val days: TextView = layout.findViewById(R.id.alarm_card_days_text_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmsRWAdapter.ViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.alarm_recycler_view_card, parent, false) as RelativeLayout

        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val alarm = allAlarms[position]
        if (Utils.ADAPTER_CHECKER == "not-main") {
            holder.switch.visibility = View.VISIBLE
        } else {
            holder.switch.visibility = View.GONE
        }
        setupAlarmNameText(holder.name, alarm)
        setupAlarmTimeText(holder.time, alarm)
        setupAlarmSwitch(holder.switch, alarm, position)
        setupAlarmDaysText(holder.days, alarm)

        //edit alarm
        holder.layout.setOnClickListener {
            val activity = it.context as MainActivity
            val arguments = Bundle()
            arguments.putParcelable("alarm", alarm)
            startAlarmSetupFragment(activity, AlarmSetupFragment(), arguments, "AlarmSetupFragment")
        }
    }

    private fun setupAlarmNameText(name: TextView, alarm: Alarm) {
        if (alarm.name.isNotBlank()) {
            name.text = alarm.name
            name.visibility = TextView.VISIBLE
        } else {
            name.text = ""
            name.visibility = TextView.GONE
        }
    }

    private fun setupAlarmTimeText(time: TextView, alarm: Alarm) {
        val seconds = (alarm.hours * 3600) + (alarm.minutes * 60)
        Utils.getAlarmTimeDescription(alarm.hours, alarm.minutes)
        time.text = activity.getFormattedTime(seconds, false, true)
    }

    private fun setupAlarmSwitch(switch: Switch, alarm: Alarm, position: Int) {

        switch.isChecked = alarm.isOn

        switch.setOnClickListener { view ->
            view.isEnabled = false
            val activity = activity
            if (switch.isChecked) {
                turnOnAlarm(activity, alarm, position)
            } else {
                turnOffAlarm(activity, alarm, position)
            }
            view.isEnabled = true
        }
    }

    private fun setupAlarmDaysText(days: TextView, alarm: Alarm) {
        if (alarm.isSingleAlarm()) {
            days.text =
                MainApp.applicationContext().resources.getString(R.string.alarm_list_single_alarm_days_description)
            return
        }

        var daysText = ""

        val resources = MainApp.applicationContext().resources
        val daysToAbbr = hashMapOf<String, String>(
            resources.getString(R.string.alarm_days_monday) to resources.getString(R.string.alarm_setup_days_monday_text_view),
            resources.getString(R.string.alarm_days_tuesday) to resources.getString(R.string.alarm_setup_days_tuesday_text_view),
            resources.getString(R.string.alarm_days_wednesday) to resources.getString(R.string.alarm_setup_days_wednesday_text_view),
            resources.getString(R.string.alarm_days_thursday) to resources.getString(R.string.alarm_setup_days_thursday_text_view),
            resources.getString(R.string.alarm_days_friday) to resources.getString(R.string.alarm_setup_days_friday_text_view),
            resources.getString(R.string.alarm_days_saturday) to resources.getString(R.string.alarm_setup_days_saturday_text_view),
            resources.getString(R.string.alarm_days_sunday) to resources.getString(R.string.alarm_setup_days_sunday_text_view)
        )

        alarm.days.forEach {
            if (it.value) {
                daysText += daysToAbbr[it.key]
                daysText += ", "
            }
        }
        daysText = daysText.dropLast(2)

        days.text = daysText
    }

    private fun turnOnAlarm(activity: MainActivity, alarm: Alarm, positionInRV: Int) {
        activity.disposable.add(activity.viewModel.updateAlarmStatus(alarm.aid, true)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                allAlarms[positionInRV].isOn = true
                Utils.setAlarmWithDays(alarm, activity)
                Utils.updateAlarmNotification(allAlarms, activity)
            })
    }

    private fun turnOffAlarm(activity: MainActivity, alarm: Alarm, positionInRV: Int) {
        activity.disposable.add(activity.viewModel.updateAlarmStatus(alarm.aid, false)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                allAlarms[positionInRV].isOn = false
                Utils.stopAlarm(
                    alarm.aid,
                    activity.getSystemService(Context.ALARM_SERVICE) as AlarmManager,
                    activity
                )
                Utils.updateAlarmNotification(allAlarms, activity)
            })
    }

    override fun getItemCount(): Int {
        return allAlarms.size
    }
}
