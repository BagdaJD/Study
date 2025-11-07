```kotlin
Generic - обобщение

class MyArrayList<T> : MyList<T>{  
    var length: Int = 0  
    var array: Array<Any> = Array(20) {Any()}  
  
    override fun get(ind: Int): T = if(ind in 0..length) array[ind] as T else throw IndexOutOfBoundsException()  
  
    override fun add(str: T) {  
        if(length >= array.size){  
            val newArray: Array<Any> = Array(length * 2) {Any()}  
            for(i in 0..<array.size){  
               newArray[i] = array[i];  
           }            newArray[length] = str as Any  
            array = newArray;  
            length += 1  
        }else{  
            array[length] = str as Any  
            length += 1  
        }  
  
    }  
    override fun delete(str: T) {  
        var ind: Int = -1  
        for(i in 0..<length){  
            if(array[i] == str){  
                ind = i;  
                break;  
            }        }        if(ind == -1) throw IndexOutOfBoundsException()  
        delAtInd(ind)  
    }  
    override fun delAtInd(ind: Int) {  
        if(ind  !in 0..<array.size) throw IndexOutOfBoundsException()  
        for(i in ind..<length){  
            array[i] = array[i+1]  
        }        length -= 1  
    }  
  
    override fun size(): Int = length  
}
-------------------
fun main(){  
    val list : MyList<String> = MyArrayList()  
    for(i in 0..100){  
        list.add("$i")  
    }    for(i in 0..< 46){  
        list.delAtInd(0)  
    }    for(i in 0..<list.size()) {  
        println(list.get(i))  
    }}
    //Сразу создать массив типа T не получится, т.к компилятор должен знать сколько памяти выделять, поэтому и пишем тип Any
 -------------------
//Дженеоики в статических методах
companion object{  
    fun<E> myListOf(vararg elements: E) : MyArrayList<E>{  
        val list = MyArrayList<E>()  
        for(element in elements){  
            list.add(element)  
        }        return list  
    }  
}
//Для статических методов обобщения нужно отдельно вписывать

val list = MyArrayList.myListOf() //не будет работать 
val list: MyList<Int> = MyArrayList.myListOf() //а так будет

------------------
//Lateinit var 
//Случай: мы создаем переменную, но пока не знаем ее значение
private var a: String = ""  
  
fun printA(){  
    a = "rojbgier"  
    println(a)  
}

//1.Первый способ сделать ее нулабельной
//2.Второй способ подразумевает использованиеи lateinit
private var a: String = ""  
  
fun printA(){  
    a = "rojbgier"  
    println(a)  
}
private lateinit var a: String   
fun printA(){  
    a = "rojbgier"  
    print(a)
    
//Подходит только, если мы абсолютно уверенны, что инициализация произойдет 
//иначе будет исключение

//lateinit лучше не использовать как и !!
```