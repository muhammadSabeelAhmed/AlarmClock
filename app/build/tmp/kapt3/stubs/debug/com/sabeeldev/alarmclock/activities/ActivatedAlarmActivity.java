package com.sabeeldev.alarmclock.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\fH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\u001a\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020\u0005H\u0016J\u0012\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u001cH\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020*H\u0014J\u0012\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\u001cH\u0014J\b\u00103\u001a\u00020\u001cH\u0002J\b\u00104\u001a\u00020\u001cH\u0002J\u0010\u00105\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020\u001cH\u0002J\b\u00109\u001a\u00020\u001cH\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\b\u0010;\u001a\u00020\u001cH\u0002J\b\u0010<\u001a\u00020\u001cH\u0002J\b\u0010=\u001a\u00020\u001cH\u0002J\b\u0010>\u001a\u00020\u001cH\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J\b\u0010@\u001a\u00020\u001cH\u0002J\b\u0010A\u001a\u00020\u0011H\u0002J\b\u0010B\u001a\u00020\u001cH\u0002J\b\u0010C\u001a\u00020\u001cH\u0002J\b\u0010D\u001a\u00020\u001cH\u0002J\b\u0010E\u001a\u00020\u001cH\u0002J\b\u0010F\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/sabeeldev/alarmclock/activities/ActivatedAlarmActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/hardware/SensorEventListener;", "()V", "amountOfShakeTimes", "", "currentAlarm", "Lcom/sabeeldev/alarmclock/database/Alarm;", "delayAlarmTime", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastShakeTime", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "mediaPlayerPosition", "playSoundInSilent", "", "secondsToHoldButton", "sensorManager", "Landroid/hardware/SensorManager;", "vibrator", "Landroid/os/Vibrator;", "viewModel", "Lcom/sabeeldev/alarmclock/viewModel/AlarmViewModel;", "volume", "", "addDelayTimeToAlarm", "", "alarm", "delayTime", "changeTextInShakeDialog", "delayAlarm", "getCurrentAlarmId", "getTurnOffModeFromAlarm", "", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRegisteredShake", "onRestoreInstanceState", "onSaveInstanceState", "outState", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onStop", "ringAlarm", "setupAccelerometer", "setupCorrectTurnOffDialog", "setupDelayButton", "setupHoldButtonDialog", "setupLabelTextForDialog", "setupMediaPlayer", "setupOnHoldTurnOffButton", "setupPreferences", "setupPressButtonDialog", "setupShakeDeviceDialog", "setupTooltipForHoldButton", "setupTurnOffButton", "setupViewModel", "shouldPlaySound", "turnOffAlarm", "updateAlarmNotification", "updateAlarmStatusAndNotification", "vibrate", "wakeUpDevice", "app_debug"})
public final class ActivatedAlarmActivity extends androidx.appcompat.app.AppCompatActivity implements android.hardware.SensorEventListener {
    private com.sabeeldev.alarmclock.database.Alarm currentAlarm;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private com.sabeeldev.alarmclock.viewModel.AlarmViewModel viewModel;
    private final android.media.MediaPlayer mediaPlayer = null;
    private android.os.Vibrator vibrator;
    private android.hardware.SensorManager sensorManager;
    private long lastShakeTime;
    private int mediaPlayerPosition = 0;
    private int secondsToHoldButton = 0;
    private int amountOfShakeTimes = 0;
    private float volume = 0.0F;
    private int delayAlarmTime = 0;
    private boolean playSoundInSilent = true;
    private java.util.HashMap _$_findViewCache;
    
    public ActivatedAlarmActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupCorrectTurnOffDialog(com.sabeeldev.alarmclock.database.Alarm alarm) {
    }
    
    private final long getCurrentAlarmId() {
        return 0L;
    }
    
    private final java.lang.String getTurnOffModeFromAlarm(com.sabeeldev.alarmclock.database.Alarm alarm) {
        return null;
    }
    
    private final void setupPressButtonDialog() {
    }
    
    private final void setupHoldButtonDialog() {
    }
    
    private final void setupShakeDeviceDialog() {
    }
    
    private final void wakeUpDevice() {
    }
    
    private final void setupPreferences() {
    }
    
    private final void setupTooltipForHoldButton() {
    }
    
    private final void setupLabelTextForDialog() {
    }
    
    private final void setupAccelerometer() {
    }
    
    private final void updateAlarmStatusAndNotification() {
    }
    
    private final void updateAlarmNotification() {
    }
    
    private final void setupMediaPlayer() {
    }
    
    private final void ringAlarm() {
    }
    
    private final boolean shouldPlaySound() {
        return false;
    }
    
    private final void vibrate() {
    }
    
    private final void setupDelayButton() {
    }
    
    private final void delayAlarm() {
    }
    
    private final void addDelayTimeToAlarm(com.sabeeldev.alarmclock.database.Alarm alarm, int delayTime) {
    }
    
    private final void setupTurnOffButton() {
    }
    
    private final void setupOnHoldTurnOffButton() {
    }
    
    private final void turnOffAlarm() {
    }
    
    @java.lang.Override()
    public void onAccuracyChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @java.lang.Override()
    public void onSensorChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.SensorEvent event) {
    }
    
    private final void onRegisteredShake() {
    }
    
    private final void changeTextInShakeDialog() {
    }
}