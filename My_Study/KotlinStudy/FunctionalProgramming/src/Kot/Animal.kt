package Kot

open class Animal(val name: String, var weight: Float, val habitat: String){
    open fun eat(){
        println("Eating food")
    }

    open fun run(){
        println("Running")
    }
}