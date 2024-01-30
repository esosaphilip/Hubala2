package com.esosaphilip.hulaba2

import android.app.Application
import com.esosaphilip.hulaba2.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class HulabaApplication: Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@HulabaApplication)
            modules(appModule)
        }

    }
}