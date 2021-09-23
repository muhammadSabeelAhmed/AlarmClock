package com.sabeeldev.alarmclock.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J!\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0014\u00a2\u0006\u0002\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020\u0014H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/sabeeldev/alarmclock/preference/NumberPickerPreference;", "Landroid/preference/DialogPreference;", "context", "Landroid/content/Context;", "attributes", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxValue", "", "getMaxValue", "()I", "setMaxValue", "(I)V", "minValue", "getMinValue", "setMinValue", "picker", "Landroid/widget/NumberPicker;", "value", "onBindDialogView", "", "view", "Landroid/view/View;", "onCreateDialogView", "onDialogClosed", "positiveResult", "", "onGetDefaultValue", "a", "Landroid/content/res/TypedArray;", "index", "(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;", "onSetInitialValue", "restorePersistedValue", "defaultValue", "", "setValue", "setupNumberPicker", "app_debug"})
public final class NumberPickerPreference extends android.preference.DialogPreference {
    private android.widget.NumberPicker picker;
    private int value = 0;
    private int maxValue = 50;
    private int minValue = 0;
    
    public NumberPickerPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributes) {
        super(null, null, 0, 0);
    }
    
    public final int getMaxValue() {
        return 0;
    }
    
    public final void setMaxValue(int p0) {
    }
    
    public final int getMinValue() {
        return 0;
    }
    
    public final void setMinValue(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View onCreateDialogView() {
        return null;
    }
    
    private final void setupNumberPicker() {
    }
    
    @java.lang.Override()
    protected void onBindDialogView(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onDialogClosed(boolean positiveResult) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Integer onGetDefaultValue(@org.jetbrains.annotations.Nullable()
    android.content.res.TypedArray a, int index) {
        return null;
    }
    
    @java.lang.Override()
    protected void onSetInitialValue(boolean restorePersistedValue, @org.jetbrains.annotations.Nullable()
    java.lang.Object defaultValue) {
    }
    
    private final void setValue(int value) {
    }
}