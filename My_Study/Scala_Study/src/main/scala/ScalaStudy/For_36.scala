package ScalaStudy

import scala.io.StdIn.*


object For_36 extends App{
  val N = readLine("N >> ").toInt
  val K = readLine("K >> ").toInt
  var sum = 0.0


  for (i <- 1 to N) {
    sum += math.pow(i, K)
  }
  print(sum)
}
