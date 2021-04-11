package ru.gureev.dagger2testapp


class ClassA(var classB: ClassB) {

    fun getHelloFromClassB(): String {
        return classB.getHello()
    }
}