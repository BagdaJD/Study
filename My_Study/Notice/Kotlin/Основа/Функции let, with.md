**Функция высшего порядка** - это та функция, которая принимает в качестве параметра функцию(или в качестве возвращаемого значения выступает другая функция)

```kotlin
var name: String? = null  
fun main(){  
    if(name?.length?.compareTo(5) == 1){  
        println("error")  
    }  
}
-----
//? - везде вопросительные знаки, т.к допускаем, что можем получить нуллабельный тип данных

//.compareTo(*) сравнивает * с выбранным значением(length) и возвращает 1/0
//лучше использовать для сравнения нулабельных типов
var name: String? = null 
fun main(){  
    if(name == null){  
        return  
    }  
    if(name.length >  1){  
        println("error")  
    }  
}
//будет ошибка, т.к к глобальной переменной можно будет обратиться в другом потоке и изменить ее
//и если ее сделать локальной, то все будет нормально, т.к будет идти проверка на нуллабельность
---------
name?.let{  
    if(it.length > 5){  
        println(it.length)  
    }}
//Работает функция let следующим образом, если 
//name == null, то весь код внутри этой функции не выполнится
//иначе, все будет работать и внутри функции будет предполагать, что переменная не нуллабельная

val list: MutableList<Int> = mutableListOf()  
with(list){  
    for(i in 0..<1000){  
        add((Math.random() * 100).toInt())  
        //this.add(...)  
    }  
    val averageList = average()  
    //this.average()  
    val minList = min()  
    val maxList = max()  
    val first = first()  
    val last = last()  
    val sumList = sum()  
  
    println("$averageList ; $minList ; $maxList ; $first ; $last ; $sumList")  
}
//with(list) - позволяет опускать название переменноц и сразу использовать все возможные для нее методы


//val listOfNum: MutableList<Int>? = mutableListOf() - если хотим создать нуллабельный список и т.д
```