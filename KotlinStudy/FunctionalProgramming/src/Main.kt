fun main(){
    val array = generateSequence(0) {it + 2}
    val evenList = array.take(10)

    for(i in  evenList){
        println(i)
    }
}


/*
import kotlin.random.Random
fun main(){
    val listOfNumbers = mutableListOf<Int>()
    for(i in 0..999){
        listOfNumbers.add(Random.nextInt(from=0, until=1000))
        println(i)
    }

    val newListOfNumbers = listOfNumbers.filter{it % 3 == 0 || it % 5 == 0}.map{it * it}.sortedDescending().map{"$it"}
    for(i in newListOfNumbers){
        println(i)
    }

}
*/


/*fun main() {
    val perim: (Int, Int) -> Int = {a, b -> 2 * (a + b)}
    val sayHello: (String) -> Unit = {it -> println("Hello $it")}
    //val sortArr: (Array<Int>) -> Array<Int> = {it -> it.sortedArrayDescending()}

    val sortArr: (Array<Int>) -> Array<Int> = {
        for(i in it.size - 2 downTo 0){
            for(j in 0..i){
                if(it[j] < it[j + 1]){
                    var t = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = t
                }
            }
        }
        it
    }

    println(perim(10, 12))
    println(sayHello("Baga"))
    val arr = sortArr(arrayOf(1, 2, 3, 4, 5))

    for(i in arr){
        println(i)
    }
}*/