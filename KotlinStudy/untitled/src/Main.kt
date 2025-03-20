fun main() {
    val n = readln().toInt()
    val food = if(n > 500){
        "Пицца"
    }else if(n > 200){
        "Шаурма"
    }else{
        null
    }
    println(food)
}