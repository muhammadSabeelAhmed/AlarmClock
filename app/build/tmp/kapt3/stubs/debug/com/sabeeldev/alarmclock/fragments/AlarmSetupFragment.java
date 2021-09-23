package com.sabeeldev.alarmclock.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0015\u001a\u00020\n2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0017j\b\u0012\u0004\u0012\u00020\u000e`\u0018H\u0002J*\u0010\u0019\u001a\u00020\n2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0017j\b\u0012\u0004\u0012\u00020\u000e`\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J!\u0010\u001c\u001a\u00020\n2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e\"\u00020\u001fH\u0002\u00a2\u0006\u0002\u0010 J \u0010!\u001a\u00020\n2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0017j\b\u0012\u0004\u0012\u00020\u000e`\u0018H\u0002J \u0010\"\u001a\u00020\n2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0017j\b\u0012\u0004\u0012\u00020\u000e`\u0018H\u0002J\u0018\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0017j\b\u0012\u0004\u0012\u00020\u000e`\u0018H\u0002J$\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\"\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J&\u00100\u001a\u0004\u0018\u00010\u001f2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\nH\u0016J\u0010\u00108\u001a\u00020\n2\u0006\u00109\u001a\u000206H\u0016J\b\u0010:\u001a\u00020\nH\u0016J\u0012\u0010;\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010<\u001a\u00020\nH\u0002J\u0018\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0002J\u0010\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020&H\u0002J\u001c\u0010B\u001a\u00020\n2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0DH\u0002J\u001c\u0010E\u001a\u00020\n2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0DH\u0002J \u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\rH\u0002J(\u0010J\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\rH\u0002J\u0010\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\rH\u0002J\b\u0010Q\u001a\u00020\nH\u0002J\b\u0010R\u001a\u00020\nH\u0002J\b\u0010S\u001a\u00020\nH\u0002J\b\u0010T\u001a\u00020\nH\u0002J\b\u0010U\u001a\u00020\nH\u0002J\b\u0010V\u001a\u00020\nH\u0002J\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020&H\u0002J\b\u0010Z\u001a\u00020\nH\u0002J \u0010[\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r2\u0006\u0010^\u001a\u00020\rH\u0002J\b\u0010_\u001a\u00020\nH\u0002J\b\u0010`\u001a\u00020\nH\u0002J\b\u0010a\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/sabeeldev/alarmclock/fragments/AlarmSetupFragment;", "Landroidx/fragment/app/Fragment;", "()V", "RINGTONE_ACTIVITY_REQUEST_CODE", "", "activity", "Lcom/sabeeldev/alarmclock/activities/MainActivity;", "alarm", "Lcom/sabeeldev/alarmclock/database/Alarm;", "colorActiveDaysViews", "", "map", "Ljava/util/HashMap;", "", "Landroid/widget/TextView;", "Lkotlin/collections/HashMap;", "createAlarm", "createConfirmDeletionDialog", "id", "", "deleteAlarm", "disableDayButtons", "dayButtons", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "disableMultipleButtonsUI", "saveButton", "Landroid/widget/Button;", "disableUI", "args", "", "Landroid/view/View;", "([Landroid/view/View;)V", "enableDayButtons", "enableMultipleDaysUI", "getDayButtonsArray", "getDaysToViewHashmap", "getRemainingTimeForAlarm", "Ljava/util/Calendar;", "earliestTime", "isDaysSelected", "", "makeToastWithRemainingTime", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSaveInstanceState", "outState", "onStop", "onViewStateRestored", "saveAlarm", "setAlarmTime", "hours", "minute", "setAlarmTimeMenuText", "calendar", "setDayActive", "it", "", "setDayInactive", "setInitialSummaryForTurnOffButton", "turnOffButtonPressDialogText", "turnOffButtonHoldDialogText", "turnOffShakeDeviceDialogText", "setNewTurnOffMode", "which", "setSummaryForRingtone", "uri", "Landroid/net/Uri;", "setSummaryForTurnOffMode", "text", "setupDays", "setupDeleteButton", "setupRingtoneButton", "setupSaveButton", "setupSingleAlarmCheckbox", "setupTimePicker", "setupTimePickerDialog", "Landroid/app/TimePickerDialog;", "time", "setupTurnOffModeButton", "setupTurnOffModeDialog", "buttonPressDialogText", "buttonHoldDialogText", "shakeDeviceDialogText", "setupUIAndAlarm", "setupUIOnEdit", "setupVibrateCheckbox", "app_debug"})
public final class AlarmSetupFragment extends androidx.fragment.app.Fragment {
    private final int RINGTONE_ACTIVITY_REQUEST_CODE = 200;
    private com.sabeeldev.alarmclock.activities.MainActivity activity;
    private com.sabeeldev.alarmclock.database.Alarm alarm;
    private java.util.HashMap _$_findViewCache;
    
    public AlarmSetupFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void setupUIAndAlarm() {
    }
    
    private final void setupUIOnEdit() {
    }
    
    private final void setupTimePicker() {
    }
    
    private final android.app.TimePickerDialog setupTimePickerDialog(java.util.Calendar time) {
        return null;
    }
    
    private final void setAlarmTime(int hours, int minute) {
    }
    
    private final void setAlarmTimeMenuText(java.util.Calendar calendar) {
    }
    
    private final void setupTurnOffModeButton() {
    }
    
    private final void setInitialSummaryForTurnOffButton(java.lang.String turnOffButtonPressDialogText, java.lang.String turnOffButtonHoldDialogText, java.lang.String turnOffShakeDeviceDialogText) {
    }
    
    private final void setupTurnOffModeDialog(java.lang.String buttonPressDialogText, java.lang.String buttonHoldDialogText, java.lang.String shakeDeviceDialogText) {
    }
    
    private final void setNewTurnOffMode(int which, java.lang.String turnOffButtonPressDialogText, java.lang.String turnOffButtonHoldDialogText, java.lang.String turnOffShakeDeviceDialogText) {
    }
    
    private final void setSummaryForTurnOffMode(java.lang.String text) {
    }
    
    private final void setupRingtoneButton() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setSummaryForRingtone(android.net.Uri uri) {
    }
    
    private final void setupSingleAlarmCheckbox() {
    }
    
    private final void disableMultipleButtonsUI(java.util.ArrayList<android.widget.TextView> dayButtons, android.widget.Button saveButton) {
    }
    
    private final void enableMultipleDaysUI(java.util.ArrayList<android.widget.TextView> dayButtons) {
    }
    
    private final java.util.ArrayList<android.widget.TextView> getDayButtonsArray() {
        return null;
    }
    
    private final void enableDayButtons(java.util.ArrayList<android.widget.TextView> dayButtons) {
    }
    
    private final void disableDayButtons(java.util.ArrayList<android.widget.TextView> dayButtons) {
    }
    
    private final void setupDays() {
    }
    
    private final java.util.HashMap<java.lang.String, android.widget.TextView> getDaysToViewHashmap() {
        return null;
    }
    
    private final boolean isDaysSelected() {
        return false;
    }
    
    private final void colorActiveDaysViews(java.util.HashMap<java.lang.String, android.widget.TextView> map) {
    }
    
    private final void setDayActive(java.util.Map.Entry<java.lang.String, ? extends android.widget.TextView> it) {
    }
    
    private final void setDayInactive(java.util.Map.Entry<java.lang.String, ? extends android.widget.TextView> it) {
    }
    
    private final void setupVibrateCheckbox() {
    }
    
    private final void setupSaveButton() {
    }
    
    private final void setupDeleteButton() {
    }
    
    private final void createConfirmDeletionDialog(long id) {
    }
    
    private final void deleteAlarm(long id) {
    }
    
    private final void saveAlarm() {
    }
    
    private final void disableUI(android.view.View... args) {
    }
    
    private final void createAlarm(com.sabeeldev.alarmclock.database.Alarm alarm) {
    }
    
    private final void makeToastWithRemainingTime(com.sabeeldev.alarmclock.database.Alarm alarm) {
    }
    
    private final java.util.Calendar getRemainingTimeForAlarm(java.util.Calendar earliestTime) {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}