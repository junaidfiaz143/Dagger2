package com.example.firstkotlin

import android.app.Application
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory().create(143)

    }
}