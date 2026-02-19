import kotlin.math.tanh
var name: String? = "Str"
fun main(){
    if (name != null) {
        if (name?.length!! > 5) {
            println("Больше 5-ти")
        } else {
            println("Меньше 5-ти")
        }
    }
    println(getSquareParall(10))
    val s: String = "345"
    val i: Int = s!!.toInt()
}

fun getSquareParall(a: Int, b: Int = a, c: Int = a) = a * b * c
fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
    if(lastName.isNotEmpty()){
        println("Фамилия: $lastName")
    }
    if(name.isNotEmpty()){
        println("Имя: $name")
    }
    if(patronymic.isNotEmpty()){
        println("Отчество: $patronymic")
    }
}