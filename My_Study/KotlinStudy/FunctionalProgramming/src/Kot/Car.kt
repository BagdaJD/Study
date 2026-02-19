package Kot

class Car(override var name: String = "Car") : Transport(name) {
    override fun drive() {
        println("Driving on the car")
    }

    fun startEngine() : Boolean {
        return true
    }
}