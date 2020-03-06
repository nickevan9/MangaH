package com.phone.extension.mangah

import android.app.Application
import android.content.res.Resources
import com.phone.extension.mangah.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppController : Application() {
    companion object {
        lateinit var res: Resources
        lateinit var mApp: AppController
    }

    override fun onCreate() {
        super.onCreate()
        res = resources
        mApp = this


//        MobileAds.initialize(this) {}
        startKoin {
            androidLogger()
            androidContext(this@AppController)
            modules(appModules)
        }
    }
}