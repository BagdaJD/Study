package Kot

/*
import Months.Month
import jdk.dynalink.Operation
import java.util.Locale
import java.util.Locale.getDefault
import Months.Month.*
import Months.Season.*
import java.util.ArrayList
import kotlin.reflect.typeOf
*/

import kotlinx.coroutines.*
//2dr4import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
//import kotlinx.coroutines.time.delay

suspend fun doWork(){
    for(i in 0..5){
        println("I working a $i hours")
        delay(400L)
    }
}

suspend fun doRest(){
    for(i in 5..10){
        println("I'm resting a $i hours")
        delay(400L)
    }
}

suspend fun doTeach(){
    for(i in 5..10){
        println("I'm teaching a $i hours")
        delay(400L)
    }
}

suspend fun getMessage() : String{
    delay(700L)
    return "Hello"
}

suspend fun sumNums(a: Int, b: Int) : Int{
    delay(700L)
    return a + b
}

suspend fun CoroutineScope.getTypes() : ReceiveChannel<String> = produce{
    val users = listOf("String", "Int", "Boolean")
    for(user in users){
        send(user)
        delay(400L)
    }
}

suspend fun main() = coroutineScope<Unit>{
    val types = getTypes()
    types.consumeEach{type -> println(type)}

}
/*
suspend fun main() = coroutineScope{
    val msg = async{getMessage()}

    msg.cancelAndJoin()
    try{
        println(msg.await())
    }catch (e: CancellationException){
        println("Error")
    }finally {
        println("Finish")
    }
}

suspend fun main() = coroutineScope{
   val job = launch(Dispatchers.Default,CoroutineStart.LAZY){
       println("${Thread.currentThread().name}")
   }
    job.start()
    launch{
        println("Эта корутина работает в потоке ${Thread.currentThread().name}")
    }
    println("Main работает в потоке ${Thread.currentThread().name}")
}


fun main(){
    val list: MyList<Int> = MyArrayList.myListOf()
}

fun main(){
    val db = Database
    db.insertData("1")
    db.insertData("2")
    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")
    for(str in db.data){
        println(str)
    }
    for(i in 1..5){

    }
}


fun main(){
    val randInt = MyRandom.randNumInDiap(listOf(1, 2, 3, 11, 12, 13))
    val randBool = MyRandom.randTrueFalse()
    val randDay = MyRandom.randDayOfWeek()

    println(randInt)
    println(MyRandom.randNumInDiap(1, 100))
    println(randBool)
    println(randDay)

}


fun main(){
    val sportsmen = Sportsmen()
//    sportsmen.callVodonosa(object : Vodonos{
//        override fun prinestiVodu() {
//            println("Nesu vodu")
//        }
//    })
    sportsmen.callVodonosa {println("Water")}
}


fun main() {
    travel(object : Transport("ABobus"){
        override fun drive() {
            println("Driving on Abobus")
        }
    })
}

fun travel(transport: Transport){
    transport.drive()
}

  val car: Transport = Car()

    val bike: Transport = Bicycle()
    //if(car !is Car) return
    if(car is Car && car.startEngine()){
        println("")
    }
    println(car.name)
fun main(){
    val collWorkers: List<Worker> = listOf(
        Seller("Biba", 11),
        Programmer("Boba", 12),
        Seller("lol", 14),
        Programmer("lll", 15),
        Director("Bobo", 123)
    );

    val collCleaner: List<Cleaner> = collWorkers.filter{it is Cleaner}.map {it as Cleaner}

    for(cleaner in collCleaner){
        cleaner.clean()
    }

    val arrWorkers = ArrayList<Worker>()
    var worker = Seller("Worker0", 20);
    var programmer = Programmer("Lang0", 20)
    for(i in 1..<5){
        arrWorkers.add(worker);
        arrWorkers.add(programmer);
        programmer = Programmer("Lang$i", 20 + i)
        worker = Seller("Worker$i", 20 + i);
    }

    arrWorkers.add(Director("Nick", 50))
    for(i in arrWorkers){
        i.work()
        if(i is Cleaner){
            i.clean()
        }
        if(i is Programmer){
            println(i.langProg)
        }


        //worker as Cleaner
    //}

}

fun main(){
        val month = SEPTEMBER
        val season = when(month){
            DECEMBER, JANUARY, FEBRUARY -> WINTER
            MARCH, APRIL, MAY -> SPRING
            JULY, JUNE, AUGHUST -> SUMMER
            SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
        }
    println(month.tempAverage)

}

fun main(){
    val address1 = Address("Rostov", "Zorge", 11)
    val address2 = address1.copy()

    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)

    val (name1, street1, number1) = address1
    val (name2, street2, number2) = address2

}


fun main(){
    val student1 = Student("Ivan", "Ivanov", "4563")
    val student2 = student1.copy(newId = "2345")
    val(name, lastName, id) = student1
    var(name1, _ , _) = student1
    print(name)
    println(student2.name)
    println(student2.lastName)
    println(student2.id)
}


fun main(){
    val cat = Cat("Barsik", 12, 4f)

    cat.printInfo()
    println(cat.isOld)

    cat.age = 10
    println(cat.isOld)

    val worker = Worker("Baga", "Programmer", 2018)
    worker.work()
    println(worker.stage)
    worker.printInfo()
}

fun Worker.printInfo() = println("Name = $name; Job = $job; Data = $data; Stage = $stage")


fun Kot.main(){
    val dog = Kot.Dog()
    dog.name = "phuntik"
    dog.age = 11
    dog.ves = 111
    dog.ves = 0
    dog.age = 0


    println("Age = ${dog.age}; Ves = ${dog.ves}; Name = ${dog.name}")

}
//такое обращение к полям не считается чем-то плохим, т.к в данном случае идет обращение к свойствам
//да и в целом полей класса нет, это называется свойствами



    val user = Kot.User()
    user.name = null
    user.age = 15
    println("Name = ${user.name}; Age = ${user.age}")

fun Kot.main(){
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


fun Kot.main(){
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

fun Kot.main(){
    val list: List<Int> = listOf(11, 12, 13, 14, 15)
    val res = modifyList(list){it.sum()}
    println(res)
}

val listOfNum: MutableList<Int>? = mutableListOf()

fun Kot.main(){
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

fun Kot.main(){
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

fun Kot.printInfo(data: Map<String, List<Int>>) : Unit {
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
fun Kot.main(){
    val money: Map<String, List<Int>> = mapOf(
        "January" to listOf(10, 20, 30, 40),
        "February" to listOf(20, -21, 30, 50),
        "March" to listOf(67, 23, 12, 11)
    )

    Kot.printInfo(money)

}


fun Kot.main(){
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

fun Kot.main(){
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
fun Kot.main(){

    val array = generateSequence("Kot.Worker №1"){
        val index = it.substring(8).toInt()
        "Kot.Worker №${index + 1}"

    }


    val resList = array.take(100)
    for(i: String in resList){
        println(i)
    }

}



import kotlin.random.Random
fun Kot.main(){
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


/*fun Kot.main() {
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