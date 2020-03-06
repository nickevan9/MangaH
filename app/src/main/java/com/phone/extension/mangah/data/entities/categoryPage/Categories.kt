package com.phone.extension.mangah.data.entities.categoryPage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.bindList

class Categories : IKsoup(".columns") {

    val categories: List<CategoryItem> by bindList(CategoryItem())

}