package ScalaStudy

trait Work {
  def work(): Unit
  def coffee(): Unit = println("Coffee")
}

class People(name: String, age: Int, job: String) extends Work {
  private val Name = name
  private val Age = age
  private val Job = job

  def work(): Unit = {
    Job match{
      case "Programmer" => println("Salary >3000$")
      case "Chef" => println("Salary >1500$")
      case "Uborschik" => println("Salary >30000000$")
    }

  def coffee(): String = {
    val str = s"I a $Name and i drink coffee"
    str
  }

  }

  def sayHello() : Unit = {
    println(s"Hello, my name is $Name .I'm a $Age years old")
  }


}
