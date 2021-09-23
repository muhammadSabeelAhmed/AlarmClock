package com.sabeeldev.alarmclock.database

import android.content.Context
import com.sabeeldev.alarmclock.viewModel.ViewModuleFactory

object Injection {

    private fun provideAlarmDataSource(context: Context): AlarmDao {
        val database = AlarmDatabase.getInstance(context)
        return database.alarmDao()
    }

    fun provideViewModelFactory(context: Context): ViewModuleFactory.ViewModelFactory {
        val dataSource = provideAlarmDataSource(context)
        return ViewModuleFactory.ViewModelFactory(dataSource)
    }
}
