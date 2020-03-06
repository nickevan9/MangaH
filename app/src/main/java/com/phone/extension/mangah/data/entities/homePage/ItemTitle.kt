package com.phone.extension.mangah.data.entities.homePage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.*

class ItemTitle : IKsoup(".tile.is-ancestor") {

    val mangas: List<MangaTitle> by bindList(MangaTitle())

}