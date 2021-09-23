package com.sabeeldev.alarmclock.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

@Database(entities = [(Alarm::class)], version = 1)
abstract class AlarmDatabase: RoomDatabase() {

    abstract fun alarmDao(): AlarmDao

    companion object {
        private var INSTANCE: AlarmDatabase? = null

        fun getInstance(context: Context): AlarmDatabase {
            if (INSTANCE == null) {
                synchronized (AlarmDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            AlarmDatabase::class.java, "alarm.db")
                            .build()
                }
            }

            return INSTANCE!!
        }
    }
}