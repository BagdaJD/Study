import jdk.dynalink.Operation
import java.util.Locale
import java.util.Locale.getDefault

fun main(){
    val dog = Dog()
    dog.name = "phuntik"
    dog.age = 11
    dog.ves = 111
    dog.ves = 0
    dog.age = 0

    println("Age = ${dog.age}; Ves = ${dog.ves}; Name = ${dog.name}")

}
//такое обращение к полям не считается чем-то плохим, т.к в данном случае идет обращение к свойствам
//да и в целом полей класса нет, это называется свойствами

/*

    val user = User()
    user.name = null
    user.age = 15
    println("Name = ${user.name}; Age = ${user.age}")

fun main(){
    val list = listOf<Int>();
    val str = "gfd"
    MyWith(list){
        sum()
        average()
    }
    MyWith(str){
        uppercase(getDefault())
    }
    println(str)

}

inline fun<T, R>MyWith(obj: T, operation: T.() -> R) : R{
   return obj.operation()
}


fun main(){
    val age = 5;
    val str = "";
    println(str.isNotEmpty())
    println(age.isPositive())
    println(age.isSimple())
    if(age.isAgeValid()){
        println("Valid")
    }
    if(age.isAgeValid()){
        println("Valid too")
    }
    if(age.isAgeValid()){
        println("Valid2 too")
    }
}

fun modifyString(str: String, modify: (String) -> String) : String{
    return modify(str)
}

inline fun modifyList(list: List<Int>, modify: (List<Int>) -> Int) : Int{
    return modify(list)
}

fun func(i: Int, mod: (Int) -> Unit){
    println(mod(i))
}

fun main(){
    val list: List<Int> = listOf(11, 12, 13, 14, 15)
    val res = modifyList(list){it.sum()}
    println(res)
}

val listOfNum: MutableList<Int>? = mutableListOf()

fun main(){
    listOfNum?.let {
        with(it){
            for(i in 0..<1000){
                add((Math.random() * 1000).toInt())
            }
           val res =  filter { it % 2 == 0 }.take(100)
           /* val listEven = it.filter{it % 2 == 0}
            for(i in 0..<100){
                println(listEven[i])
            }
           */
            for(i in res){
                println(i)
            }
        }
    }

}

fun main(){
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



}

fun printInfo(data: Map<String, List<Int>>) : Unit {
    val validData = data.filter { it.value.all { it >= 0 } }
    val averagePerWeek = validData.flatMap { it.value }.average()
    val listOfSum = validData.map { it.value.sum() }
    val averagePerMonth = listOfSum.average()
    val minAmonth = listOfSum.min()
    val maxAmonth = listOfSum.max()

    val maxMonth = validData.filter { it.value.sum() == maxAmonth }.keys
    val minMonth = validData.filter { it.value.sum() == minAmonth }.keys

    println("Средняя выручка в неделю: ${averagePerWeek}")
    println("Средняя выручка в месяц: ${averagePerMonth}")
    println("Максимальная выручка за все время: ${maxAmonth}, месяц: $maxMonth")
    println("Минимадбная выручка за все время: ${minAmonth}, месяц: $minMonth")

}
fun main(){
    val money: Map<String, List<Int>> = mapOf(
        "January" to listOf(10, 20, 30, 40),
        "February" to listOf(20, -21, 30, 50),
        "March" to listOf(67, 23, 12, 11)
    )

    printInfo(money)

}


fun main(){
    val data = mapOf<String, List<Int>>(
        "file1" to listOf(15, 20, 30, 40),
        "file2" to listOf(35, -20, 30, 43),
        "file3" to listOf(45, 70, -21, 40)
    )
    val average = data.filterNot{it.value.all{it >= 0}}.flatMap{it.value}.average()
    println(average)

}
*/

/*
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

*/
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