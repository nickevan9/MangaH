package com.phone.extension.mangah.data.entities.homePage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.bindList


class ItemMale : IKsoup(".male") {

    val packages: List<MangaHome> by bindList(MangaHome())

}