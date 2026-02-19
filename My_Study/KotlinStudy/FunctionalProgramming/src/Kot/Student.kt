package Kot

class Student(val name: String, val lastName: String, val id: String) {

    fun copy(newName: String = name, newLastName: String = lastName, newId: String = id) : Student{
        return Student(newName, newLastName, newId)
    }
}