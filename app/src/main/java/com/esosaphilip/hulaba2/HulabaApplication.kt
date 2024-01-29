package com.esosaphilip.hulaba2

import android.app.Application


class HulabaApplication: Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@HulabaApplication)
            modules(appModule)
        }

    }
}