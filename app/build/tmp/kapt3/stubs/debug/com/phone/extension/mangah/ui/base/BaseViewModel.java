package com.phone.extension.mangah.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/phone/extension/mangah/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "exceptionHandler", "Lkotlin/coroutines/CoroutineContext;", "getExceptionHandler", "()Lkotlin/coroutines/CoroutineContext;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "showError", "Lcom/phone/extension/mangah/utils/SingleLiveEvent;", "", "getShowError", "()Lcom/phone/extension/mangah/utils/SingleLiveEvent;", "showLoading", "", "getShowLoading", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.phone.extension.mangah.utils.SingleLiveEvent<java.lang.Boolean> showLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final com.phone.extension.mangah.utils.SingleLiveEvent<java.lang.String> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler mHandler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.phone.extension.mangah.utils.SingleLiveEvent<java.lang.Boolean> getShowLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.phone.extension.mangah.utils.SingleLiveEvent<java.lang.String> getShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.CoroutineContext getExceptionHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMHandler() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}