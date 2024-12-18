import kotlin.math.*

fun main() {
    // put your code here
    var x1: Int = readln().toInt()
    var y1: Int = readln().toInt()
    var x2: Int = readln().toInt()
    var y2: Int = readln().toInt()

    var p = abs(x1 - x2) + abs(y1 - y2)

    println(p)
}
