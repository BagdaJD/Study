import scala.io.StdIn.*

object For_20 {
  val N = readLine().toInt
  var fctrl = 1
  var sum = 0

  for i <- 1 to N do
    for j <- 1 to i do
      fctrl *= j
    sum += fctrl
    fctrl = 1

  println(sum)
}
