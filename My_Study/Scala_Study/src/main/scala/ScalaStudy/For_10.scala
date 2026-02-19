package ScalaStudy

import scala.io.StdIn.*

object For_10 extends App{
  val N = readLine().toInt
  var sum: Double = 0

  for i <- 1 to N do
    sum += 1.0 / i
    println(s"i = $i; sum = $sum")
  println(sum)

}
