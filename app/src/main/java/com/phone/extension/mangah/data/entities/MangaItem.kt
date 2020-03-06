package com.phone.extension.mangah.data.entities

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.*

class MangaItem : IKsoup(".story-item") {

    class MoreInfo : IKsoup(".more-info") {

        val listStatus: List<Info> by bindList(
            Info()
        )
        val description by bindText(".excerpt")

    }

    class Info : IKsoup(".info") {
        val info by bindText("p")
    }

    class ListTag : IKsoup(".list-tags") {
        val tag: List<Tag> by bindList(
            Tag()
        )
    }

    class Tag : IKsoup("blue") {
        val tag by bindText("a")
    }

    class Episode : IKsoup(".episode-book") {
        val episode by bindText("a")
    }

    class TimeUpdate : IKsoup(".top-notice") {
        val time by bindText("span")
    }

    val name by bindText("h3")

    val link by bindLink("h3 a")

    val icon by bindImage(".story-cover")

    val info: MoreInfo by bindClass(
        MoreInfo(), this)

    val tag: ListTag by bindClass(
        ListTag(), this)

    val episode: Episode by bindClass(
        Episode(), this)

    val timeUpdate: TimeUpdate by bindClass(
        TimeUpdate(), this)

}