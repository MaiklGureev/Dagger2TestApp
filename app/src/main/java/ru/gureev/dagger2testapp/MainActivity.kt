package ru.gureev.dagger2testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gureev.dagger2testapp.databinding.ActivityMainBinding
import ru.gureev.dagger2testapp.di.App
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var classA: ClassA
    @Inject lateinit var classB: ClassB

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init dagger2
        App.appComponent.inject(this)

        //init ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //use ViewBinding
        binding.helloWorldText.text = classA.getHelloFromClassB()

        //use Dagger2
        classB.sayHelloFromToast()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}