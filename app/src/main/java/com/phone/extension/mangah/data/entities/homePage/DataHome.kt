package com.phone.extension.mangah.data.entities.homePage

import com.phone.extension.mangah.data.entities.MangaItem

data class DataHome(
    val headerTitle: String,
    val icon: Int,
    val listManga: List<MangaItem>

)