```kotlin
//Пример создания статического метода

//Calc.kt
companion object{  
    fun square(num: Int) : Int = num * num  
}

//Main.kt
fun main(){  
    println(Calc.square(4)) 
}
//companion object - этор объект, который относится к классу, в котором он объявлен

//все члены companion object не имеют доступ к свойствам класса, в котором онобъявлен

val PI = 3.14
//когда мы создаем переменную через val, то она автоматически считается private, а также для нее создается только геттер

const val Pi = 3.14
//Здесь уже геттер не создатся
```