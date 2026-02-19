package Kot

class Programmer(val langProg: String, age: Int) : Worker("Programmer$age", age), Cleaner {
    override fun work(){
        println("Writing code on $langProg")
    }

    override fun clean() {
        println("Programmer are cleaning")
    }
}