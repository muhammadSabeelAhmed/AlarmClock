package com.sabeeldev.alarmclock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J.\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u0004J\u0018\u0010!\u001a\u0004\u0018\u00010\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0#H\u0002J\u0006\u0010$\u001a\u00020\nJ\u0016\u0010%\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010&\u001a\u00020\r2\b\u0010\'\u001a\u0004\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\nH\u0002J\u0016\u0010)\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010.\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u00100\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00101\u001a\u00020/H\u0002J(\u00102\u001a\u00020\r2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020\u0004J\u001e\u0010:\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010=\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0#2\u0006\u0010\u000e\u001a\u00020\u000fJ*\u0010>\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nJ\"\u0010?\u001a\u00020@*\u00020\u000f2\u0006\u0010A\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/sabeeldev/alarmclock/Utils;", "", "()V", "ADAPTER_CHECKER", "", "getADAPTER_CHECKER", "()Ljava/lang/String;", "setADAPTER_CHECKER", "(Ljava/lang/String;)V", "ALARM_NOTIFICATION_ID", "", "NOTIFICATION_REQUEST_CODE", "dismissAlarmNotification", "", "context", "Landroid/content/Context;", "displayAlarmLogs", "alarmDate", "Ljava/util/Calendar;", "formatTime", "showSeconds", "", "use24HourFormat", "hours", "minutes", "seconds", "getAlarmDateFromAlarm", "alarm", "Lcom/sabeeldev/alarmclock/database/Alarm;", "dayOfWeek", "getAlarmDayForNotification", "getAlarmTimeDescription", "getDate", "getEarliestAlarm", "allAlarms", "", "getPassedSeconds", "setAlarmWithDays", "setDaysInEarliestAlarm", "earliestAlarm", "alarmDay", "setSingleAlarm", "setupAlarmIntent", "Landroid/app/PendingIntent;", "id", "", "setupNotification", "Landroidx/core/app/NotificationCompat$Builder;", "setupNotificationIntent", "notification", "startAlarmSetupFragment", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "arguments", "Landroid/os/Bundle;", "name", "stopAlarm", "alarmManager", "Landroid/app/AlarmManager;", "updateAlarmNotification", "formatTo12HourFormat", "getFormattedTime", "Landroid/text/SpannableString;", "passedSeconds", "makeAmPmSmaller", "app_debug"})
public final class Utils {
    @org.jetbrains.annotations.NotNull()
    public static final com.sabeeldev.alarmclock.Utils INSTANCE = null;
    private static final int ALARM_NOTIFICATION_ID = 100;
    private static final int NOTIFICATION_REQUEST_CODE = 101;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ADAPTER_CHECKER = "main";
    
    private Utils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getADAPTER_CHECKER() {
        return null;
    }
    
    public final void setADAPTER_CHECKER(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setSingleAlarm(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.database.Alarm alarm, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startAlarmSetupFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setAlarmWithDays(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.database.Alarm alarm, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void displayAlarmLogs(java.util.Calendar alarmDate) {
    }
    
    public final void stopAlarm(long id, @org.jetbrains.annotations.NotNull()
    android.app.AlarmManager alarmManager, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final int getPassedSeconds() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.SpannableString getFormattedTime(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getFormattedTime, int passedSeconds, boolean showSeconds, boolean makeAmPmSmaller) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatTo12HourFormat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$formatTo12HourFormat, boolean showSeconds, int hours, int minutes, int seconds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatTime(boolean showSeconds, boolean use24HourFormat, int hours, int minutes, int seconds) {
        return null;
    }
    
    public final void updateAlarmNotification(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sabeeldev.alarmclock.database.Alarm> allAlarms, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder setupNotification(android.content.Context context, com.sabeeldev.alarmclock.database.Alarm alarm) {
        return null;
    }
    
    private final java.lang.String getAlarmDayForNotification(com.sabeeldev.alarmclock.database.Alarm alarm) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlarmTimeDescription(int hours, int minutes) {
        return null;
    }
    
    private final void dismissAlarmNotification(android.content.Context context) {
    }
    
    private final com.sabeeldev.alarmclock.database.Alarm getEarliestAlarm(java.util.List<com.sabeeldev.alarmclock.database.Alarm> allAlarms) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getAlarmDateFromAlarm(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.database.Alarm alarm) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getAlarmDateFromAlarm(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.database.Alarm alarm, @org.jetbrains.annotations.NotNull()
    java.lang.String dayOfWeek) {
        return null;
    }
    
    private final void setDaysInEarliestAlarm(com.sabeeldev.alarmclock.database.Alarm earliestAlarm, int alarmDay) {
    }
    
    private final android.app.PendingIntent setupAlarmIntent(long id, android.content.Context context) {
        return null;
    }
    
    private final void setupNotificationIntent(android.content.Context context, androidx.core.app.NotificationCompat.Builder notification) {
    }
}