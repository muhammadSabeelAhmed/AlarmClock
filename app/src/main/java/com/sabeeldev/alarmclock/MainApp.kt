package com.sabeeldev.alarmclock

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.squareup.leakcanary.LeakCanary

class MainApp : Application() {

    init {
        MultiDex.install(this);
        instance = this
    }

    companion object {
        private var instance: MainApp? = null

        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }

}