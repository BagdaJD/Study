package Kot

import java.util.Calendar

class Worker(var name: String, var job: String, var data: Int) {
    val stage: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - data

    fun work() = println("I'm work")
}