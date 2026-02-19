package Kot

class Cat(val name: String, var age: Int, val weight: Float) {
    val isOld: Boolean
        get() = age >= 12

    fun printInfo(){
        println("Name = $name; Age = $age; Weight = $weight;")
    }

    fun checkAgeCat() : Boolean = age >= 12
}