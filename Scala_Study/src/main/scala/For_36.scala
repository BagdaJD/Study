import scala.io.StdIn.*


object For_36 {
  val N = readLine("N >> ").toInt
  val K = readLine("K >> ").toInt
  var sum = 0.0


  for i <- 1 to N do
    sum += math.pow(i, K)
  print(sum)
}
