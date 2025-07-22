fun generatePhoneNumbers(size: Int) : MutableList<String>{
    val listOfNumbers: MutableList<String> = mutableListOf()
    var firstNum = (Math.random()*999).toInt()
    var secondNum = (Math.random()*999).toInt()
    var thirdNum = (Math.random()*99).toInt()
    var fourthNum = (Math.random()*99).toInt()
    var strNum = "+7-$firstNum-$secondNum-$thirdNum-$fourthNum"
    for(i in 1..size){
        listOfNumbers.add(strNum)
        firstNum = (Math.random()*999).toInt()
        secondNum = (Math.random()*999).toInt()
        thirdNum = (Math.random()*99).toInt()
        fourthNum = (Math.random()*99).toInt()
        strNum = "+7-$firstNum-$secondNum-$thirdNum-$fourthNum"
    }
    return listOfNumbers
}

fun generateNames(size: Int) : MutableList<String>{
    val listOfNames: MutableList<String> = mutableListOf()
    for(i in 1..1000){
        listOfNames.add("Name$i")
    }

    return listOfNames
}

fun main(){
    val listOfNamesLastNames: MutableList<String> = mutableListOf()
    for(i in 0..<1000){
        listOfNamesLastNames.add("Name$i LastName$i")
    }

    //val names = listOfNamesLastNames.map{it.substring(0, 8)}
    val names = listOfNamesLastNames.map{it.substringAfter(" ")}
    val lastNames = listOfNamesLastNames.map{it.substring(7)}
    val listOfPairs = names.zip(lastNames)
    for(f in listOfPairs){
        println(f)
    }
}


/*
    val listOfNumbers = generatePhoneNumbers(1000)
    val listOfNames = generateNames(1000)
    for(i: Int in 0..<listOfNames.size){
        println(listOfNames[i])
        println(listOfNumbers[i])
    }
    val fullNames = listOfNames.zip(listOfNumbers)
    for(user in fullNames){
        println(user.first + user.second)
    }
*/
/*
fun main(){

    val array = generateSequence("Worker №1"){
        val index = it.substring(8).toInt()
        "Worker №${index + 1}"

    }


    val resList = array.take(100)
    for(i: String in resList){
        println(i)
    }

}



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