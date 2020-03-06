package com.phone.extension.mangah.data.entities.categoryPage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.bindList
import com.phone.extension.mangah.data.entities.MangaItem

class Suggest : IKsoup(".tile.is-ancestor") {

    val mangaItem: List<MangaItem> by bindList(MangaItem())

}