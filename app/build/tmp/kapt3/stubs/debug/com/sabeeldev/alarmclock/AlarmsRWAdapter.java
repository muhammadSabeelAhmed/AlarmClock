package com.sabeeldev.alarmclock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J \u0010 \u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\fH\u0002J \u0010\"\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\fH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/sabeeldev/alarmclock/AlarmsRWAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sabeeldev/alarmclock/AlarmsRWAdapter$ViewHolder;", "allAlarms", "Ljava/util/ArrayList;", "Lcom/sabeeldev/alarmclock/database/Alarm;", "activity", "Lcom/sabeeldev/alarmclock/activities/MainActivity;", "(Ljava/util/ArrayList;Lcom/sabeeldev/alarmclock/activities/MainActivity;)V", "getActivity", "()Lcom/sabeeldev/alarmclock/activities/MainActivity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupAlarmDaysText", "days", "Landroid/widget/TextView;", "alarm", "setupAlarmNameText", "name", "setupAlarmSwitch", "switch", "Landroid/widget/Switch;", "setupAlarmTimeText", "time", "turnOffAlarm", "positionInRV", "turnOnAlarm", "ViewHolder", "app_debug"})
public final class AlarmsRWAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sabeeldev.alarmclock.AlarmsRWAdapter.ViewHolder> {
    private final java.util.ArrayList<com.sabeeldev.alarmclock.database.Alarm> allAlarms = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sabeeldev.alarmclock.activities.MainActivity activity = null;
    
    public AlarmsRWAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sabeeldev.alarmclock.database.Alarm> allAlarms, @org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.activities.MainActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sabeeldev.alarmclock.activities.MainActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sabeeldev.alarmclock.AlarmsRWAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sabeeldev.alarmclock.AlarmsRWAdapter.ViewHolder holder, int position) {
    }
    
    private final void setupAlarmNameText(android.widget.TextView name, com.sabeeldev.alarmclock.database.Alarm alarm) {
    }
    
    private final void setupAlarmTimeText(android.widget.TextView time, com.sabeeldev.alarmclock.database.Alarm alarm) {
    }
    
    private final void setupAlarmSwitch(android.widget.Switch p0_1702747034, com.sabeeldev.alarmclock.database.Alarm alarm, int position) {
    }
    
    private final void setupAlarmDaysText(android.widget.TextView days, com.sabeeldev.alarmclock.database.Alarm alarm) {
    }
    
    private final void turnOnAlarm(com.sabeeldev.alarmclock.activities.MainActivity activity, com.sabeeldev.alarmclock.database.Alarm alarm, int positionInRV) {
    }
    
    private final void turnOffAlarm(com.sabeeldev.alarmclock.activities.MainActivity activity, com.sabeeldev.alarmclock.database.Alarm alarm, int positionInRV) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/sabeeldev/alarmclock/AlarmsRWAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layout", "Landroid/widget/RelativeLayout;", "(Landroid/widget/RelativeLayout;)V", "days", "Landroid/widget/TextView;", "getDays", "()Landroid/widget/TextView;", "getLayout", "()Landroid/widget/RelativeLayout;", "name", "getName", "switch", "Landroid/widget/Switch;", "getSwitch", "()Landroid/widget/Switch;", "time", "Lcom/simplemobiletools/commons/views/MyTextView;", "getTime", "()Lcom/simplemobiletools/commons/views/MyTextView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout layout = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView name = null;
        @org.jetbrains.annotations.NotNull()
        private final com.simplemobiletools.commons.views.MyTextView time = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView days = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout layout) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getLayout() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.commons.views.MyTextView getTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Switch getSwitch() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDays() {
            return null;
        }
    }
}