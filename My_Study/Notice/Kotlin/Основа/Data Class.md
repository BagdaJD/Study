```Kotlin
//Student.kt
class Student(val name: String, val lastName: String, val id: String)

//main.kt + Обычный класс студент
val student1 = Student("Ivan", "Ivanov", "4563")  
val student2 = Student("Ivan", "Ivanov", "4563")  
println(student1.hashCode())  
println(student2.hashCode())  
println(student1 == student2)  
println(student1 === student2)


//1854731462
//317574433
//false
//false


//main.kt + Data Class студент
data class Student(val name: String, val lastName: String, val id: String)


val student1 = Student("Ivan", "Ivanov", "4563")  
val student2 = Student("Ivan", "Ivanov", "4563")  
println(student1.hashCode())  
println(student2.hashCode())  
println(student1 == student2)  
println(student1 === student2)

//1743001399
//1743001399
//true
//false

//Отличие между Data Class и Class
//В Data Class реализовано следующее
//1.Переопределен toString()
//2.Переопределен hashCode()
//3.Переопределен equals()
//4.Переопределены методы для диструктора component1(), component2() ...
//5.Есть метод copy() для создания объекта с такими же полями, но с другой ссылкой


//Диструкторы и диструктивные операторы
//Пример работы диструктора

val student1 = Student("Ivan", "Ivanov", "4563")  
val(name, lastName, id) = student1;  
print(name)
//По сути мы создали сразу много переменных(множественное присваивание)

var(name1, _ , _) = student1
//В данном примере из объекта вытащим только его имя
//Эти диструкторы, также являются отличием обычного класса от Data, так в последнем классе переопределены методы Component1(), Component2() ...
//Но в обычном классе, мы тоже можем их переопределить
class Student(val name: String, val lastName: String, val id: String) {  
    operator fun component1() = name  
    operator fun component2() = lastName  
    operator fun component3() = id  
}
//Пример работы метода copy()
val student2 = student1.copy(id = "2345")//все свойства объекта student1 перенесутся в новый, кроме id
val student2 = student1.copy()//а здесь все перенесется

//Своя реализация метожда copy()
fun copy(newName: String = name, newLastName: String = lastName, newId: String = id) : Student{  
    return Student(newName, newLastName, newId)  
}
```