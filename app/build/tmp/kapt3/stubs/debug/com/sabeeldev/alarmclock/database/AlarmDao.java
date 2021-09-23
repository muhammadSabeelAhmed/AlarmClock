package com.sabeeldev.alarmclock.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\u000bH\'J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\'J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/sabeeldev/alarmclock/database/AlarmDao;", "", "deleteAlarm", "", "id", "", "deleteAllAlarms", "getAlarm", "Lio/reactivex/Single;", "Lcom/sabeeldev/alarmclock/database/Alarm;", "getAllAlarms", "Lio/reactivex/Maybe;", "", "insertAlarm", "alarm", "updateAlarmStatus", "value", "", "app_debug"})
public abstract interface AlarmDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM alarmData")
    public abstract io.reactivex.Maybe<java.util.List<com.sabeeldev.alarmclock.database.Alarm>> getAllAlarms();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM alarmData WHERE aid=:id")
    public abstract io.reactivex.Single<com.sabeeldev.alarmclock.database.Alarm> getAlarm(long id);
    
    @androidx.room.Query(value = "UPDATE alarmData SET isOn=:value WHERE aid=:id")
    public abstract void updateAlarmStatus(long id, boolean value);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertAlarm(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.database.Alarm alarm);
    
    @androidx.room.Query(value = "DELETE from alarmData")
    public abstract void deleteAllAlarms();
    
    @androidx.room.Query(value = "DELETE from alarmData WHERE aid=:id")
    public abstract void deleteAlarm(long id);
}