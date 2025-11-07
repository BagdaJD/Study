package Kot

class Dog(weight: Float) : Animal("Dog", weight, "Area") {
    override fun eat(){
        println("Eating kost")
    }

    private lateinit var a: String

    fun printA(){
        a = "rojbgier"
        println(a)
    }
    /*
    var name: String? = null
        get() {
            return field?.lowercase()?.replaceFirstChar{it.titlecaseChar()}
        }
    var age: Int = 0
        set(value) {
            if(value >= 0){
                field = value
            }
        }
    var ves: Int = 0

        set(value) {
            if(value >= 0){
                field = value
            }
        }
    */
}