package com.sabeeldev.alarmclock.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
interface AlarmDao {

    @Query("SELECT * FROM alarmData")
    fun getAllAlarms(): Maybe<List<Alarm>>

    @Query("SELECT * FROM alarmData WHERE aid=:id")
    fun getAlarm(id: Long): Single<Alarm>

    @Query("UPDATE alarmData SET isOn=:value WHERE aid=:id")
    fun updateAlarmStatus(id: Long, value: Boolean)

    @Insert(onConflict = REPLACE)
    fun insertAlarm(alarm: Alarm): Long

    @Query("DELETE from alarmData")
    fun deleteAllAlarms()

    @Query("DELETE from alarmData WHERE aid=:id")
    fun deleteAlarm(id: Long)
}