package Kot

interface MyList<T>{
    fun get(ind: Int) : T
    fun add(str: T)
    fun delete(str: T)
    fun delAtInd(ind: Int)
    fun size() : Int
}