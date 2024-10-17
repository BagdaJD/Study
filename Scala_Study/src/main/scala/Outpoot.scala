import scala.io.StdIn.*

object Outpoot {
  @main def Main() = {
    val N = readLine().toInt
    var sum: Double = 0

    for i <- 1 to N do
      sum += 1.0/i
      println(s"i = $i; sum = $sum")
    println(sum)

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
