```kotlin
//Наряду с launch в пакете kotlinx.coroutines есть еще один построитель корутин - функция async. Эта функция применяется, когда надо получить из корутины некоторый результат.
//async запускает отдельную корутину, которая выполняется параллельно с остальными корутинами. Например:

suspend fun getMessage() : String{  
    delay(700L)  
    return "Hello"  
}  
  
suspend fun main() = coroutineScope<Unit>{  
    val msg : Deferred<String> = async{getMessage()}  
    println("Say ${msg.await()}")  
}
//Say Hello

//Кроме того, async-корутина возвращает объект Deferred, который ожидает получения результата корутины. (Интерфейс Deferred унаследован от интерфейса Job, поэтому для также доступны весь функционал, определенный для интефейса Job)

//Для получения результата из объекта Deferred применяется функция await().

//В данном случае для имитации продолжительной работы определена функция getMessage(), которая возвращает строку.

//С помощью функции async запускаем корутину, которая выполняет эту функцию.

//Поскольку функция getMessage() возвращает объект типа String, то возвращаемый корутиной объект представляет тип Deferred<String> (объект Deferred типизиуется возвращаемым типом функции, то есть в данном случае типом String).
suspend fun sumNums(a: Int, b: Int) : Int{  
    delay(700L)  
    return a + b  
}  
  
suspend fun main() = coroutineScope<Unit>{  
    val sum1 = async{sumNums(5, 5)}  
    val sum2 = async{sumNums(3, 6)}  
    val sum3 = async{sum1.await() * sum2.await()}  
  
    println("Sum3 == ${sum3.await()}")  
}
//При этом все три корутины будут запущены одновременно
```
### Отложенный вызов корутины
```kotlin
//По умолчанию построитель корутин async создает и сразу же запускает корутину. Но как и при создании корутины с помощью launch для async-корутин можно применять технику отложенного запуска. Только в данном случае корутина запускается не только при вызове метода start объекта Deferred (который усналедован от интерфейса Job), но также и с помощью метода await() при обращении к результу корутины.
suspend fun main() = coroutineScope<Unit>{  
    val sum1 = async(start = CoroutineStart.LAZY){sumNums(5, 5)}  
    println("Start")  
    delay(1000L)  
    println("Sum3 == ${sum1.await()}")  
}
//Вывод
//Start
//Sum3 == 10

//Если необходимо, чтобы корутина еще до метода await() начала выполняться, то можно вызвать метод start()
suspend fun main() = coroutineScope<Unit>{  
    val sum1 = async(start = CoroutineStart.LAZY){sumNums(5, 5)}  
    
    println("Start")  
    sum1.start()  
    println("${sum1.await()}")  
    
    delay(1000L)  
    println("Finish")  
    println("Sum3 == ${sum1.await()}")  
}

/*
Start
10
Finish
Sum3 == 10
*/
```