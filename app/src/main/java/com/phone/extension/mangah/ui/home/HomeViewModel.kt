package com.phone.extension.mangah.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.fcannizzaro.ksoup.Ksoup
import com.phone.extension.mangah.AppController
import com.phone.extension.mangah.R
import com.phone.extension.mangah.data.entities.homePage.*
import com.phone.extension.mangah.ui.base.BaseViewModel
import com.phone.extension.mangah.utils.Constant
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class HomeViewModel : BaseViewModel() {
    private val listTitle: MutableLiveData<List<MangaTitle>> = MutableLiveData()
    val mListTitle: LiveData<List<MangaTitle>> get() = listTitle

    val context = AppController.mApp

    private val listManga: MutableLiveData<List<DataHome>> = MutableLiveData()
    val mListManga: LiveData<List<DataHome>> get() = listManga


    fun getListManga() {
        showLoading.value = true
        viewModelScope.launch(exceptionHandler) {
            withContext(Dispatchers.IO) {
                val document = Jsoup.connect(Constant.HOME_PAGE).get()
                val ksoup = Ksoup(document)

                val itemTitle: ItemTitle = ksoup.from(ItemTitle())
                val itemNew: ItemNew = ksoup.from(ItemNew())
                val itemMale: ItemMale = ksoup.from(ItemMale())
                val itemFemale: ItemFemale = ksoup.from(ItemFemale())

                val listItem = mutableListOf<DataHome>()

                listItem.add(
                        DataHome(
                                context.resources.getString(R.string.manga_new),
                                R.drawable.ic_new,
                                itemNew.mangaItems
                        )
                )

                listItem.add(
                        DataHome(
                                context.resources.getString(R.string.manga_male),
                                R.drawable.ic_male,
                                itemMale.mangaItems
                        )
                )

                listItem.add(
                        DataHome(
                                context.resources.getString(R.string.manga_female),
                                R.drawable.ic_female,
                                itemFemale.mangaItems
                        )
                )
                listManga.postValue(listItem)
                listTitle.postValue(itemTitle.mangas)
            }
            showLoading.value = false
        }
    }
}