package Kot

import java.util.Arrays

class MyArrayList<T> : MyList<T>{
    var length: Int = 0
    var array: Array<Any> = Array(20) {Any()}

    companion object{
        fun<E> myListOf(vararg elements: E) : MyArrayList<E>{
            val list = MyArrayList<E>()
            for(element in elements){
                list.add(element)
            }
            return list
        }
    }

    override fun get(ind: Int): T = if(ind in 0..length) array[ind] as T else throw IndexOutOfBoundsException()

    override fun add(str: T) {
        if(length >= array.size){
            val newArray: Array<Any> = Array(length * 2) {Any()}
            for(i in 0..<array.size){
               newArray[i] = array[i];
           }
            newArray[length] = str as Any
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
            }
        }
        if(ind == -1) throw IndexOutOfBoundsException()
        delAtInd(ind)
    }

    override fun delAtInd(ind: Int) {
        if(ind  !in 0..<array.size) throw IndexOutOfBoundsException()
        for(i in ind..<length){
            array[i] = array[i+1]
        }
        length -= 1
    }

    override fun size(): Int = length
}