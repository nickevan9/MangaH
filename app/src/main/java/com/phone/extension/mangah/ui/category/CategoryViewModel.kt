package com.phone.extension.mangah.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.fcannizzaro.ksoup.Ksoup
import com.phone.extension.mangah.data.entities.MangaItem
import com.phone.extension.mangah.data.entities.categoryPage.Categories
import com.phone.extension.mangah.data.entities.categoryPage.CategoryItem
import com.phone.extension.mangah.data.entities.categoryPage.Suggest
import com.phone.extension.mangah.ui.base.BaseViewModel
import com.phone.extension.mangah.utils.Constant
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class CategoryViewModel : BaseViewModel() {
    private val listCategory: MutableLiveData<List<CategoryItem>> = MutableLiveData()
    val mListCategory: LiveData<List<CategoryItem>> get() = listCategory

    private val listSuggestion: MutableLiveData<List<MangaItem>> = MutableLiveData()
    val mListSuggestion: LiveData<List<MangaItem>> = listSuggestion

    fun getListCategory() {
        showLoading.value = true
        viewModelScope.launch(exceptionHandler) {
            withContext(Dispatchers.IO) {
                val documentHome = Jsoup.connect(Constant.ACTION_PAGE).get()

                val ksoup = Ksoup(documentHome)

                val itemTitle: Categories = ksoup.from(Categories())
                val itemSuggest: Suggest = ksoup.from(Suggest())

                listCategory.postValue(itemTitle.categories)
                listSuggestion.postValue(itemSuggest.mangaItem)

            }
            showLoading.value = false
        }
    }
}
