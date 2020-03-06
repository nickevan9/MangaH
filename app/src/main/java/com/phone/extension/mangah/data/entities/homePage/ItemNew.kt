package com.phone.extension.mangah.data.entities.homePage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.bindList
import com.phone.extension.mangah.data.entities.MangaItem

class ItemNew : IKsoup(".latest") {

    val mangaItems: List<MangaItem> by bindList(
        MangaItem()
    )

}