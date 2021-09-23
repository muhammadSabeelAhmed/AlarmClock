package com.sabeeldev.alarmclock.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import com.sabeeldev.alarmclock.activities.ActivatedAlarmActivity

class AlarmReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        val newIntent = setupNewIntent(context, intent)
        context.startActivity(newIntent)
    }

    private fun setupNewIntent(context: Context, intent: Intent?): Intent {
        val newIntent = Intent(context, ActivatedAlarmActivity::class.java)
        //passing alarm id to new activity
        newIntent.putExtra("alarmId", intent?.extras?.getLong("alarmId"))
        newIntent.flags = FLAG_ACTIVITY_NEW_TASK
        return newIntent
    }
}