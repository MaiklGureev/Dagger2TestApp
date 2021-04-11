package ru.gureev.dagger2testapp.di

import android.app.Application
import ru.gureev.dagger2testapp.di.modules.AppModule

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDagger2()
    }

    fun initDagger2() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .build()
    }

}
