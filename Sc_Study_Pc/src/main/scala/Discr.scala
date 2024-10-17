import scala.io.StdIn.readLine

object Discr {
  val a : Double = readLine().toDouble
  val b : Double = readLine().toDouble
  val c : Double = readLine().toDouble
  
  val D : Double = b * b - 4 * a * c
  println(D)
  if D >= 0 then
     if D == 0 then
       val x1 = -1 * b + math.sqrt(D)
       print(x1)
     else
       val x1 = -1 * b + math.sqrt(D)
       val x2 = -1 * b - math.sqrt(D)
       print(x1, x2)
  else
     print("Нет корней")
}
