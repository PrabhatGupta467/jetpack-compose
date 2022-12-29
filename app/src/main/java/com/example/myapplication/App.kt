package com.example.myapplication

import android.app.Application
import com.jio.jioads.adinterfaces.JioAds

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        JioAds.getInstance().setLogLevel(JioAds.LogLevel.DEBUG)
        JioAds.getInstance().init(this)
    }
}