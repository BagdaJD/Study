```kotlin
/*
Корутина может выполняться только в определенной области корутины (`coroutine scope`). Область корутин представляет пространство, в рамках которого действуют корутины, она имеет определенный жизненный цикл и сама управляет жизненным циклом создаваемых внутри нее корутин.

И для создания области корутин в Kotlin может использоваться ряд функций, которые создают объект интерфейса CoroutineScope. Одной из функций является coroutineScope.
*/
suspend fun doWork() = coroutineScope{  
    launch{  
        for(i in 0..5){  
        println("I working a $i hours")  
        delay(400L)  
       }  
     }  
}  
  
suspend fun main() {  
    doWork()  
}

//Хороший пример
suspend fun doWork() = coroutineScope{  
    launch{  
        for(i in 0..5){  
        println("I working a $i hours")  
        delay(400L)  
       }    }  
}  
  
suspend fun doRest() = coroutineScope {   
launch {   
for(i in 5..10){  
            println("I'm resting a $i hours")  
            delay(500L)  
        }    }  
}  
  
suspend fun main(){  
    doWork()  
    doRest()  
}
//Если в main не добавить coroutineScope, то методы doWork(), doRest() просто отработают по очереди(поэтому ошибки и нет) 
//suspend нужен для мейн, т.к doWork(), doRest() с этим же модификатором

//Заработает параллельно(ассинхронно)
suspend fun doWork(){  
        for(i in 0..5){  
        println("I working a $i hours")  
        delay(400L)  
       }}  
  
suspend fun doRest(){  
    for(i in 5..10){  
        println("I'm resting a $i hours")  
        delay(400L)  
    }}  
  
suspend fun main() = coroutineScope<Unit>{  
    launch{  
        doWork()  
        /*
			for(i in 0..5){  
		    println("I working a $i hours")  
		    delay(400L)  
		}
        */
  
    }  
    launch {  
        doRest()  
        /*
        for(i in 5..10){  
	    println("I'm resting a $i hours")  
	    delay(400L)  
	    }
        */
    }  
}
//Тоже хороший пример
suspend fun doWork() = coroutineScope{  
    launch {  
        for(i in 0..5){  
            println("I working a $i hours")  
            delay(400L)  
        }    }  
  
}  
  
suspend fun doRest() = coroutineScope{  
    launch {  
        for(i in 5..10){  
            println("I'm resting a $i hours")  
            delay(400L)  
        }    }  
}  
  
suspend fun main() = coroutineScope<Unit>{  
    doWork()  
    doRest()  
}
//ЗДесь уже не будет ассинхронности: сначала вполнится doWork() потом doRest()
//Т.к проработает сначала одна корутина, а затем другая, как бы они запустятся не параллельно

/*
Функция coroutineScope(), которая создает область корутин, будет ожидать завершения всех определенных в этой области корутин. То есть функция main завршит выполнение, когда будут завершены обе корутины.
*/

//runBlocking
//Кроме функции coroutineScope для создания контекста корутины может применяться функция runBlocking.

suspend fun main() = runBlocking<Unit>{  
    launch {  
        doWork()  
    }  
    launch {  
        doRest()  
    }  
}
/*
Функция runBlocking блокирует вызывающий поток, пока все корутины внутри вызова runBlocking { ... } не завершат свое выполнение. В этом собственно основное отличие runBlocking от coroutineScope: coroutineScope не блокирует вызывающий поток, а просто приостанавливает выполнение, освобождания поток для использования другими ресурсами.
*/

//Вложенные корутины
suspend fun main() = coroutineScope<Unit>{  
    launch {  
        doTeach()  //Сначала выполнится эта функция
        launch {  //Затем выполнятся внутренние корутины
            doRest()  
            delay(400L)  
        }  
        launch {  
            doWork()  
        }  
    }}//И лишь, когда выполнятся внутренние корутины, выполнится внешняя
    
/*И подобным образом внешние корутины определяют область для вложенных корутин и управляют их жизненным циклом.*/
```