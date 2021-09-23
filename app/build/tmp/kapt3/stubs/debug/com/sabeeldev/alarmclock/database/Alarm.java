package com.sabeeldev.alarmclock.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.sabeeldev.alarmclock.database.LinkedHashmapToStringConventer.class, com.sabeeldev.alarmclock.database.HashmapToStringConventer.class})
@androidx.room.Entity(tableName = "alarmData")
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012$\b\u0002\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0012J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\fH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J%\u0010D\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u0010H\u00c6\u0003J\t\u0010E\u001a\u00020\nH\u00c6\u0003J\u008d\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052$\b\u0002\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u00102\b\b\u0002\u0010\u0011\u001a\u00020\nH\u00c6\u0001J\t\u0010G\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010H\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010JH\u00d6\u0003J\u0006\u0010K\u001a\u00020LJ\t\u0010M\u001a\u00020\u0007H\u00d6\u0001J\u0006\u0010N\u001a\u00020\nJ\t\u0010O\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u0015\u001a\u0004\b(\u0010)R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010.\"\u0004\b/\u00100R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u00105R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u00105R:\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010)\"\u0004\b9\u0010:R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100\u00a8\u0006U"}, d2 = {"Lcom/sabeeldev/alarmclock/database/Alarm;", "Landroid/os/Parcelable;", "aid", "", "name", "", "hours", "", "minutes", "vibrate", "", "days", "Ljava/util/LinkedHashMap;", "ringtone", "turnOffMode", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isOn", "(JLjava/lang/String;IIZLjava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/HashMap;Z)V", "TURN_OFF_MODE_BUTTON_HOLD", "getTURN_OFF_MODE_BUTTON_HOLD$annotations", "()V", "getTURN_OFF_MODE_BUTTON_HOLD", "()Ljava/lang/String;", "TURN_OFF_MODE_BUTTON_PRESS", "getTURN_OFF_MODE_BUTTON_PRESS$annotations", "getTURN_OFF_MODE_BUTTON_PRESS", "TURN_OFF_MODE_SHAKE_DEVICE", "getTURN_OFF_MODE_SHAKE_DEVICE$annotations", "getTURN_OFF_MODE_SHAKE_DEVICE", "getAid", "()J", "setAid", "(J)V", "getDays", "()Ljava/util/LinkedHashMap;", "setDays", "(Ljava/util/LinkedHashMap;)V", "daysStringToCalendar", "getDaysStringToCalendar$annotations", "getDaysStringToCalendar", "()Ljava/util/HashMap;", "getHours", "()I", "setHours", "(I)V", "()Z", "setOn", "(Z)V", "getMinutes", "setMinutes", "getName", "setName", "(Ljava/lang/String;)V", "getRingtone", "setRingtone", "getTurnOffMode", "setTurnOffMode", "(Ljava/util/HashMap;)V", "getVibrate", "setVibrate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getEarliestDate", "Ljava/util/Calendar;", "hashCode", "isSingleAlarm", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Alarm implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long aid;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @androidx.room.ColumnInfo(name = "hours")
    private int hours;
    @androidx.room.ColumnInfo(name = "minutes")
    private int minutes;
    @androidx.room.ColumnInfo(name = "isVibrate")
    private boolean vibrate;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "days")
    private java.util.LinkedHashMap<java.lang.String, java.lang.Boolean> days;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ringtone")
    private java.lang.String ringtone;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "turnOffMode")
    private java.util.HashMap<java.lang.String, java.lang.Boolean> turnOffMode;
    @androidx.room.ColumnInfo(name = "isOn")
    private boolean isOn;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final java.util.HashMap<java.lang.String, java.lang.Integer> daysStringToCalendar = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final java.lang.String TURN_OFF_MODE_BUTTON_PRESS = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final java.lang.String TURN_OFF_MODE_BUTTON_HOLD = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final java.lang.String TURN_OFF_MODE_SHAKE_DEVICE = null;
    public static final android.os.Parcelable.Creator<com.sabeeldev.alarmclock.database.Alarm> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sabeeldev.alarmclock.database.Alarm copy(long aid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int hours, int minutes, boolean vibrate, @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.Boolean> days, @org.jetbrains.annotations.Nullable()
    java.lang.String ringtone, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Boolean> turnOffMode, boolean isOn) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Alarm() {
        super();
    }
    
    public Alarm(long aid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int hours, int minutes, boolean vibrate, @org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.Boolean> days, @org.jetbrains.annotations.Nullable()
    java.lang.String ringtone, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Boolean> turnOffMode, boolean isOn) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getAid() {
        return 0L;
    }
    
    public final void setAid(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getHours() {
        return 0;
    }
    
    public final void setHours(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getMinutes() {
        return 0;
    }
    
    public final void setMinutes(int p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getVibrate() {
        return false;
    }
    
    public final void setVibrate(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, java.lang.Boolean> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, java.lang.Boolean> getDays() {
        return null;
    }
    
    public final void setDays(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRingtone() {
        return null;
    }
    
    public final void setRingtone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Boolean> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Boolean> getTurnOffMode() {
        return null;
    }
    
    public final void setTurnOffMode(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Boolean> p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean isOn() {
        return false;
    }
    
    public final void setOn(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Integer> getDaysStringToCalendar() {
        return null;
    }
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getDaysStringToCalendar$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTURN_OFF_MODE_BUTTON_PRESS() {
        return null;
    }
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getTURN_OFF_MODE_BUTTON_PRESS$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTURN_OFF_MODE_BUTTON_HOLD() {
        return null;
    }
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getTURN_OFF_MODE_BUTTON_HOLD$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTURN_OFF_MODE_SHAKE_DEVICE() {
        return null;
    }
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getTURN_OFF_MODE_SHAKE_DEVICE$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getEarliestDate() {
        return null;
    }
    
    public final boolean isSingleAlarm() {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.sabeeldev.alarmclock.database.Alarm> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.sabeeldev.alarmclock.database.Alarm createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.sabeeldev.alarmclock.database.Alarm[] newArray(int size) {
            return null;
        }
    }
}