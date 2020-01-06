package com.phone.extension.mangah.data.pref

import android.content.Context
import com.phone.extension.mangah.AppController.Companion.mApp

const val PREF_KEY_FIRST_TIME = "PREF_KEY_FIRST_TIME"

class PrefManager : PrefHelper {

    private val sharedPreferences = mApp.getSharedPreferences(
        mApp.packageName,
        Context.MODE_PRIVATE
    )
    private val editor = sharedPreferences.edit()

    override fun getFirstTime(): Boolean {
        return sharedPreferences.getBoolean(PREF_KEY_FIRST_TIME, true)
    }

    override fun setFirstTime(isFirstTime: Boolean) {
        editor.putBoolean(PREF_KEY_FIRST_TIME, isFirstTime)
        editor.apply()
    }

}