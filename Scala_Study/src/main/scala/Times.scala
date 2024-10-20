import scala.io.StdIn.*

object Times extends App{
  val N: Int = readLine().toInt
  val H = N / 3600

  println(s"Время в часах - $H")
}
