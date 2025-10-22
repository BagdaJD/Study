package Kot

class Bicycle(name: String = "Bike") : Transport(name) {
    override fun drive() {
        println("Driving on the bike")
    }
}