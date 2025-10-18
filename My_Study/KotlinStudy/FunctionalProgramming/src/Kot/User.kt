package Kot

class User {
    public var age: Int = 0
        set(value) {
                if (value >= 0) {
                    field = value
                }
        }
    public var name: String? = null

        get() {
            return if(field == null){
                ""
            }else{
                field
            }
        }
    //field - содержимое переменной, у которой вызывается метод get()
    //value - новое значение(вводимое пользователем)
}