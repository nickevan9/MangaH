package com.phone.extension.mangah.data.entities.homePage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.bindClass
import com.fcannizzaro.ksoup.delegates.bindImage
import com.fcannizzaro.ksoup.delegates.bindLink
import com.fcannizzaro.ksoup.delegates.bindText


class MangaTitle : IKsoup(".tile.is-child") {

    class ChapterBlue : IKsoup(".chapter") {
        val chapter by bindText("div")
    }

    val name by bindText("h3")

    val link by bindLink("h3 a")

    val icon by bindImage(".cover")

    val chapterBlue: ChapterBlue by bindClass(ChapterBlue(), this)
}