package com.sabeeldev.alarmclock.activities

import androidx.lifecycle.ViewModelProviders
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.FrameLayout
import io.reactivex.disposables.CompositeDisposable
import com.sabeeldev.alarmclock.HomeListFragment
import com.sabeeldev.alarmclock.R
import com.sabeeldev.alarmclock.viewModel.AlarmViewModel
import com.sabeeldev.alarmclock.database.Injection
import com.sabeeldev.alarmclock.viewModel.ViewModuleFactory

class MainActivity : AppCompatActivity() {

    private lateinit var viewModelFactory: ViewModuleFactory.ViewModelFactory
    lateinit var viewModel: AlarmViewModel
    val disposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        PreferenceManager.setDefaultValues(this, R.xml.preferences, false)

        setContentView(R.layout.activity_main)

        viewModelFactory = Injection.provideViewModelFactory(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(AlarmViewModel::class.java)

        if (findViewById<FrameLayout>(R.id.empty_fragment_container) != null) {
            if (savedInstanceState != null) {
                return
            }


            supportFragmentManager.beginTransaction()
                    .add(R.id.empty_fragment_container, HomeListFragment())
                    .commit()
        }
    }

    override fun onStop() {
        super.onStop()
        disposable.clear()
    }
}
