fun main() {
    val time: Int? = readLine()?.toInt();
    val weather: String = readln();
    val res = when {
        weather.equals("Хорошая") && time in 8..21 -> {"Гулять"}
        weather.equals("Плохая") && time in 8..21 ->{"Читать"}
        else -> {"Спать"}
    }
    println(res)
}