package Kot

abstract class Transport(open val name: String) {
    abstract fun drive();
}