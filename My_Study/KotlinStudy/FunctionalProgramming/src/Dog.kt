class Dog {
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

}