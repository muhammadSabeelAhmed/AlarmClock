package com.sabeeldev.alarmclock.fragments

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import android.util.TypedValue
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import com.sabeeldev.alarmclock.R
import java.time.LocalDate
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.util.*
import android.widget.GridView

import android.content.Intent

import android.view.ViewGroup

import android.view.LayoutInflater
import com.sabeeldev.alarmclock.Utils
import com.sabeeldev.alarmclock.Utils.startAlarmSetupFragment
import com.sabeeldev.alarmclock.activities.MainActivity
import com.sabeeldev.alarmclock.activities.SettingsActivity


class ViewCalendarFragment : Fragment() {
    private lateinit var activity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        return inflater.inflate(R.layout.fragment_calander_view, container, false)
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
}
