package Kot

import kotlin.ranges.random

class MyRandom {
    companion object{
        fun randNumInDiap(list: List<Int>) : Int = list[(0..(list.size-1)).random()]
        fun randNumInDiap(from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt() + from
        fun randTrueFalse() : Boolean = (0..1).random() == 1
        fun randDayOfWeek() : String = when((1..7).random()){
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Error"
        }

    }
}