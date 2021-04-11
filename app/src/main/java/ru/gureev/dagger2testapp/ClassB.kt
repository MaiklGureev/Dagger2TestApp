package ru.gureev.dagger2testapp

import android.content.Context
import android.widget.Toast
import ru.gureev.dagger2testapp.di.App
import javax.inject.Inject

class ClassB {
    var helloText = "Hello. Its class b!"

    @Inject
    lateinit var context: Context

    init {
        App.appComponent.inject(this)
    }

    fun getHello(): String {
        return helloText
    }

    fun sayHelloFromToast() {
        Toast.makeText(context, helloText, Toast.LENGTH_SHORT).show()
    }

}
