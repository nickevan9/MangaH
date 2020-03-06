package com.phone.extension.mangah.data.entities.categoryPage

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.delegates.bindLink
import com.fcannizzaro.ksoup.delegates.bindText

class CategoryItem : IKsoup("li"){
    val name by bindText("a")
    val link by bindLink("a")
}