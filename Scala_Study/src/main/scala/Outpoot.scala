/* С начала суток прошло N секунд (N — целое). Найти количество полных часов, прошедших с начала суток.*/

import scala.io.StdIn.*

object Outpoot {
  val N : Int = readLine().toInt
  val H = N / 3600

  @main def Main() = println(s"Время в часах - $H")
}
