```kotlin
/*
Для создания корутины нужен построитель корутин. И одним из построителей корутин в пакете kotlinx.coroutines является функция launch. В принципе в прошлых темах уже было рассмотрено, как с помощью launch создавать корутины. Сейчас же рассмотрем некоторые аспекты подробнее.

Прежде всего, launch(), как правило, применяется, когда нам не надо возвращать результат из корутины и когда нам ее надо выполнять одновременно с другим кодом.
*/
```
### Job
```kotlin
//Построитель корутин launch возвращает объект Job, с помощью которого можно управлять запущеной корутиной:

val job: Job = launch{
    println("Some coroutin")
    delay(400L)

}
//Например, его метод join() позволяет ожидать, пока корутина не завершится. Например:
suspend fun main() = coroutineScope<Unit>{  
  val job: Job = launch{  
      doTeach()  
      delay(400L)  
  }  
    println("Start")  
    job.join()  
    println("Finish")  
}

//Вывод:
/*
Start
I'm teaching a 5 hours
I'm teaching a 6 hours
I'm teaching a 7 hours
I'm teaching a 8 hours
I'm teaching a 9 hours
I'm teaching a 10 hours
Finish
*/
```
### Отложенное выполнение
```kotlin
//По умолчанию построитель корутин launch создает и сразу же запускает корутину. Однако Kotlin также позволяет применять технику отложенного запуска корутины (lazy-запуск), при котором корутина запускается при вызове метода start() объекта Job.

//Для установки отложенного запуска в функцию launch() передается значение start = CoroutineStart.LAZY

suspend fun main() = coroutineScope<Unit>{  
  val job: Job = launch(start = CoroutineStart.LAZY){  
      doTeach()  
      delay(400L)  
  }  
    delay(1000L)  
    println("Start")  
    job.start()  
    println("Finish")  
}
/*
Вывод:
Start
Finish
I'm teaching a 5 hours
I'm teaching a 6 hours
I'm teaching a 7 hours
I'm teaching a 8 hours
I'm teaching a 9 hours
I'm teaching a 10 hours
*/
//delay() - тоже роляет
```