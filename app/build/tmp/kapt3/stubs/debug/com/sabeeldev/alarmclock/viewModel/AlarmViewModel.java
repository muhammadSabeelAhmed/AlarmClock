package com.sabeeldev.alarmclock.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/sabeeldev/alarmclock/viewModel/AlarmViewModel;", "Landroidx/lifecycle/ViewModel;", "dataSource", "Lcom/sabeeldev/alarmclock/database/AlarmDao;", "(Lcom/sabeeldev/alarmclock/database/AlarmDao;)V", "deleteAlarm", "Lio/reactivex/Completable;", "id", "", "deleteAllAlarms", "getAlarm", "Lio/reactivex/Single;", "Lcom/sabeeldev/alarmclock/database/Alarm;", "getAlarmList", "Lio/reactivex/Maybe;", "", "updateAlarm", "alarm", "updateAlarmStatus", "isOn", "", "app_debug"})
public final class AlarmViewModel extends androidx.lifecycle.ViewModel {
    private final com.sabeeldev.alarmclock.database.AlarmDao dataSource = null;
    
    public AlarmViewModel(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.database.AlarmDao dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<com.sabeeldev.alarmclock.database.Alarm>> getAlarmList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.sabeeldev.alarmclock.database.Alarm> getAlarm(long id) {
        return null;
    }
    
    public final long updateAlarm(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.database.Alarm alarm) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateAlarmStatus(long id, boolean isOn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteAllAlarms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteAlarm(long id) {
        return null;
    }
}