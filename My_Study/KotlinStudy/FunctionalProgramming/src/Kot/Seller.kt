package Kot

class Seller(name: String, age: Int) : Worker(name, age), Cleaner{
    override fun work() {
        println("Sell a products")
    }

    override fun clean() {
        println("Seller are cleaning")
    }
}