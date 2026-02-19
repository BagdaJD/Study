package Kot

import java.util.Calendar

abstract class Worker(val name: String, val age: Int){

    abstract fun work()
    /*val stage: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - data

    fun work() = println("I'm work")*/
}