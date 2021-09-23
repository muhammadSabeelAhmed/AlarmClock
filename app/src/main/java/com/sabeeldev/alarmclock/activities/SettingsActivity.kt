package com.sabeeldev.alarmclock.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sabeeldev.alarmclock.R

class SettingsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_preferences)
    }
}