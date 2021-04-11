package ru.gureev.dagger2testapp.di

import dagger.Component
import ru.gureev.dagger2testapp.ClassB
import ru.gureev.dagger2testapp.MainActivity
import ru.gureev.dagger2testapp.di.modules.AppModule
import ru.gureev.dagger2testapp.di.modules.ProviderModule
import javax.inject.Singleton

@Component(modules = [AppModule::class, ProviderModule::class])
@Singleton
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(classB: ClassB)
}