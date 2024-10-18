import scala.io.StdIn.*

object For_15 {
  var A: Double = readLine().toDouble
  val a = A
  val N = readLine().toInt

  for i <- 1 to N - 1 do
    A = A * a
  print(s"A в N-ой степени = $A")


}
