package ru.gureev.dagger2testapp.di.modules

import dagger.Module
import dagger.Provides
import ru.gureev.dagger2testapp.ClassA
import ru.gureev.dagger2testapp.ClassB

@Module
class ProviderModule {

    @Provides
    fun provideClassB(): ClassB {
        return ClassB()
    }

    @Provides
    fun provideClassA(classB: ClassB): ClassA {
        return ClassA(classB)
    }
}
