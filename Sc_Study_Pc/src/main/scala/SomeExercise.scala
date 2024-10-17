import scala.io.StdIn.*
import scala.math.*

object SomeExercise {
  val b = readLine().toInt
  var y: Double = 0

  if b == 0 then
    print("Деление на 0")
  else
    val a = readLine().toInt
    val c = readLine().toInt

    if a < 12 && c < 12 then
      print("Корня не существует")
    else if (a == 12 && b <= 12) || (a <= 12 && b == 12) then
      y = 0
    else
      var mx = a
      var mn = b
      if c > mx then
        mx = c
      if 5 < b then
        mn = 5
      y = sqrt(mx - 12) / mn
      print(y)
}
