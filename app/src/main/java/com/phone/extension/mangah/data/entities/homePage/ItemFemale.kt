package com.phone.extension.mangah.data.entities.homePage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.bindList


class ItemFemale : IKsoup(".female") {

    val packages: List<MangaHome> by bindList(MangaHome())

}