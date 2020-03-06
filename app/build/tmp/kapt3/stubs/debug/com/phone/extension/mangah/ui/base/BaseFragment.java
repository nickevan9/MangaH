package com.phone.extension.mangah.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\u001a\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010,\u001a\u00020\u0013H\u0002J$\u0010-\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010!H&J\u0006\u0010.\u001a\u00020\u0013J\u0006\u0010/\u001a\u00020\u0013J\u0010\u00100\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001eH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u00061"}, d2 = {"Lcom/phone/extension/mangah/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "mHandlerLeak", "Landroid/os/Handler;", "getMHandlerLeak", "()Landroid/os/Handler;", "mIOScope", "Lkotlinx/coroutines/CoroutineScope;", "getMIOScope", "()Lkotlinx/coroutines/CoroutineScope;", "mPreferencesManager", "Lcom/phone/extension/mangah/data/pref/PrefManager;", "getMPreferencesManager", "()Lcom/phone/extension/mangah/data/pref/PrefManager;", "setMPreferencesManager", "(Lcom/phone/extension/mangah/data/pref/PrefManager;)V", "hideKeyboard", "", "ctx", "Landroid/content/Context;", "hideLoading", "initToolbar", "title", "", "isBackPressed", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onResume", "onViewCreated", "view", "requestExternalPermission", "setLayout", "showKeyboard", "showLoading", "unbindDrawables", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler mHandlerLeak = null;
    @org.jetbrains.annotations.Nullable()
    private com.phone.extension.mangah.data.pref.PrefManager mPreferencesManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope mIOScope = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMHandlerLeak() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.phone.extension.mangah.data.pref.PrefManager getMPreferencesManager() {
        return null;
    }
    
    public final void setMPreferencesManager(@org.jetbrains.annotations.Nullable()
    com.phone.extension.mangah.data.pref.PrefManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getMIOScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View setLayout(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initToolbar(@org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isBackPressed) {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    public final void showKeyboard() {
    }
    
    private final void hideKeyboard(android.content.Context ctx) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void unbindDrawables(android.view.View view) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void requestExternalPermission() {
    }
    
    public BaseFragment() {
        super();
    }
}