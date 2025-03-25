fun main() {
    val array = arrayOfNulls<Int?>(301)
        /*
    for(i in 0 until array.size){
        array[i] = 300 + i
    }
    */
    for((index, i) in (300..601).withIndex()){
        array[index] = i
    }

    for(i in (array.size - 1) downTo 0 step 5){
        println(array[i])
    }
}