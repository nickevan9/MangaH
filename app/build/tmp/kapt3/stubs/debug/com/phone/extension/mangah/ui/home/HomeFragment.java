package com.phone.extension.mangah.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/phone/extension/mangah/ui/home/HomeFragment;", "Lcom/phone/extension/mangah/ui/base/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "mHomeViewModel", "Lcom/phone/extension/mangah/ui/home/HomeViewModel;", "getMHomeViewModel", "()Lcom/phone/extension/mangah/ui/home/HomeViewModel;", "mHomeViewModel$delegate", "Lkotlin/Lazy;", "mRVHomeAdapter", "Lcom/phone/extension/mangah/ui/adapter/RVHomeAdapter;", "mRvHome", "Landroidx/recyclerview/widget/RecyclerView;", "mShimmerFrameLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "mSliderAdapter", "Lcom/phone/extension/mangah/ui/adapter/SliderAdapter;", "mSliderView", "Lcom/smarteist/autoimageslider/SliderView;", "mSwipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "initRecyclerView", "", "view", "Landroid/view/View;", "initShimmer", "initSlideView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onRefresh", "onResume", "onViewCreated", "setLayout", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class HomeFragment extends com.phone.extension.mangah.ui.base.BaseFragment implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private final kotlin.Lazy mHomeViewModel$delegate = null;
    private com.phone.extension.mangah.ui.adapter.SliderAdapter mSliderAdapter;
    private com.phone.extension.mangah.ui.adapter.RVHomeAdapter mRVHomeAdapter;
    private com.smarteist.autoimageslider.SliderView mSliderView;
    private androidx.recyclerview.widget.RecyclerView mRvHome;
    private com.facebook.shimmer.ShimmerFrameLayout mShimmerFrameLayout;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout mSwipeRefreshLayout;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View setLayout(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final com.phone.extension.mangah.ui.home.HomeViewModel getMHomeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView(android.view.View view) {
    }
    
    private final void initSlideView(android.view.View view) {
    }
    
    private final void initShimmer(android.view.View view) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public HomeFragment() {
        super();
    }
}