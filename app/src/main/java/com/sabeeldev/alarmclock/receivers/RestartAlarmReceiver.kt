package com.sabeeldev.alarmclock.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.sabeeldev.alarmclock.service.BootService

class RestartAlarmReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        if ("android.intent.action.BOOT_COMPLETED" == intent?.action) {
            val bootIntent = Intent(context, BootService::class.java)
            context?.let { BootService().enqueueWork(it, bootIntent) }
        }
    }
}