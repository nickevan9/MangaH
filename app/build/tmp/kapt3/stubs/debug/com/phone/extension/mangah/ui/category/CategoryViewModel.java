package com.phone.extension.mangah.ui.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/phone/extension/mangah/ui/category/CategoryViewModel;", "Lcom/phone/extension/mangah/ui/base/BaseViewModel;", "()V", "listCategory", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/phone/extension/mangah/data/entities/categoryPage/CategoryItem;", "listSuggestion", "Lcom/phone/extension/mangah/data/entities/MangaItem;", "mListCategory", "Landroidx/lifecycle/LiveData;", "getMListCategory", "()Landroidx/lifecycle/LiveData;", "mListSuggestion", "getMListSuggestion", "getListCategory", "", "app_debug"})
public final class CategoryViewModel extends com.phone.extension.mangah.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.phone.extension.mangah.data.entities.categoryPage.CategoryItem>> listCategory = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.phone.extension.mangah.data.entities.MangaItem>> listSuggestion = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.phone.extension.mangah.data.entities.MangaItem>> mListSuggestion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.phone.extension.mangah.data.entities.categoryPage.CategoryItem>> getMListCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.phone.extension.mangah.data.entities.MangaItem>> getMListSuggestion() {
        return null;
    }
    
    public final void getListCategory() {
    }
    
    public CategoryViewModel() {
        super();
    }
}