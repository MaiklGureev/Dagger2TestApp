package ru.gureev.dagger2testapp.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private var applicationContext: Context) {
    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return applicationContext;
    }
}