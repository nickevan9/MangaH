package com.phone.extension.mangah.di

import com.phone.extension.mangah.ui.category.CategoryViewModel
import com.phone.extension.mangah.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { CategoryViewModel() }
}