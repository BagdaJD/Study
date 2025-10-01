```kotlin
fun Int.isAgeValid() = this in 6..100;  
  
fun main(){  
    val age = 5;  
    if(age.isAgeValid()){  
        println("Valid")  
    }    if(age.isAgeValid()){  
        println("Valid too")  
    }    if(age.isAgeValid()){  
        println("Valid2 too")  
    }}

//По сути Extansion-функции это расширение функционала определенного класса
//Т.к здесь по сути расширили класс Int и добавили туда проверку на валидности числа

fun Int.isSimple(): Boolean {  
    for(d in 2..(this / 2)){  
        if(this % 2 == 0){  
            return false;  
        }    }    return true;  
}

5.isSimple()


//Своя реализация with(){}
inline fun<T, R> MyWith(obj: T, operation: T.() -> R) : R{  
   return obj.operation()  
}

MyWith(list){  
    sum()  
    average()  
}

//В эту функцию передается какой-либо объект(будь то Int, String, Boolean etc) и прописывается блок выполняющегося кода, в котором к объекту можно ссылаться через this. operation: T.() -> R - подразумевает под собой блок кода, в котором будут вызываться extansion-функции того или иного класса(класса, к которому принадлежит объект) и вызываться его методы при этом, возвращая какое-лтбо значение

//На примере видно, что в качестве объекта передан список, а в качестве operation передан блок кода, в котором используется методы того же класса, к которому принадлежит переменная list, а по итогу будет возращаться результат исполнения кода в фигурных скобках
```
