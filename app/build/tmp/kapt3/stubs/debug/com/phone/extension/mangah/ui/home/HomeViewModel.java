package com.phone.extension.mangah.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/phone/extension/mangah/ui/home/HomeViewModel;", "Lcom/phone/extension/mangah/ui/base/BaseViewModel;", "()V", "context", "Lcom/phone/extension/mangah/AppController;", "getContext", "()Lcom/phone/extension/mangah/AppController;", "listManga", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/phone/extension/mangah/data/entities/homePage/DataHome;", "listTitle", "Lcom/phone/extension/mangah/data/entities/homePage/MangaTitle;", "mListManga", "Landroidx/lifecycle/LiveData;", "getMListManga", "()Landroidx/lifecycle/LiveData;", "mListTitle", "getMListTitle", "getListManga", "", "app_debug"})
public final class HomeViewModel extends com.phone.extension.mangah.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.phone.extension.mangah.data.entities.homePage.MangaTitle>> listTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final com.phone.extension.mangah.AppController context = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.phone.extension.mangah.data.entities.homePage.DataHome>> listManga = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.phone.extension.mangah.data.entities.homePage.MangaTitle>> getMListTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.phone.extension.mangah.AppController getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.phone.extension.mangah.data.entities.homePage.DataHome>> getMListManga() {
        return null;
    }
    
    public final void getListManga() {
    }
    
    public HomeViewModel() {
        super();
    }
}