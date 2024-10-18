import scala.io.StdIn.*


object Outpoot {
  @main def Main() = {
    val N = readLine("N >> ").toInt
    val K = readLine("K >> ").toInt
    var sum = 0.0

    for i <- 1 to N do
      sum += math.pow(i, K)
    print(sum)
  }

}
/*
багдасар писька)))
давид попка)))
миша какашка)))
аоаоаоаоаоаоаоаоаоаоаоаоаоаоаоао
1234567890
а багдасар балуется и не пишет конспект
лол
это всё из-за телефона
  ахахахахахах
*/
