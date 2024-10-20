import scala.io.StdIn.*
import scala.math.*

object Discr extends App{
  val a = readLine().toDouble
  val b = readLine().toDouble
  val c = readLine().toDouble


  val D = b * b - 4 * a * c
  println(s"D = $D")
  if D >= 0 then
    if D == 0 then
      val x1 = -1 * b + math.sqrt(D) / (2 * a)
      print(s"Уравнение имеет один корень: x1 = $x1")
    else
      val x1 = -1 * b + math.sqrt(D) / (2 * a)
      val x2 = -1 * b - math.sqrt(D) / (2 * a)
      print(s"Уравнение имеет два корня: x1 = $x1; x2 = $x2")
    else
      print("Корней нет")
  //a = 2 b = 4 c = -5
  //d = 16 + 4 * 2 * 5 = 56
  //x1 = -4 + sqrt(56)/5
}
