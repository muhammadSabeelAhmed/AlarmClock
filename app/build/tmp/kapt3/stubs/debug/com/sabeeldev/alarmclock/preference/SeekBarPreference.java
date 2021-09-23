package com.sabeeldev.alarmclock.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J!\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0014\u00a2\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/sabeeldev/alarmclock/preference/SeekBarPreference;", "Landroid/preference/Preference;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "onBindView", "", "view", "Landroid/view/View;", "onCreateView", "parent", "Landroid/view/ViewGroup;", "onGetDefaultValue", "a", "Landroid/content/res/TypedArray;", "index", "(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;", "onSetInitialValue", "restorePersistedValue", "", "defaultValue", "", "setValue", "app_debug"})
public final class SeekBarPreference extends android.preference.Preference {
    private int value = 0;
    
    public SeekBarPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected void onBindView(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onSetInitialValue(boolean restorePersistedValue, @org.jetbrains.annotations.Nullable()
    java.lang.Object defaultValue) {
    }
    
    private final void setValue(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Integer onGetDefaultValue(@org.jetbrains.annotations.Nullable()
    android.content.res.TypedArray a, int index) {
        return null;
    }
}