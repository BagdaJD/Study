```kotlin
//Создание абстрактного класса
abstract class Worker(val name: String, val age: Int)
//абстрактный класс нужен для того, чтобы от него наследовались другие классы

//если мы хотим указать, что тот или иной метод при наследовании необходимо обязательно переопределять, то пишемs abstract
abstract fun work()

//Интерфейс выглядит следующим образом 
interface Cleaner {  
    fun clean()  
}

//Интерфейс + Абстрактный класс
class Seller(name: String, age: Int) : Worker(name, age), Cleaner


//!Если мы имплементируем интерфейс в дочерние классы, то при вызове методов из интерфейса у объектов этих классов случится ошибка,т.к  мы не имплементировали методы того же самого интерфейса для родительского класса!
//Но если мы хотим, чтобы не каждый дочерний класс реализовывал метод из интерфейса, то можем использовать Smart Cast 

val arrWorkers = ArrayList<Worker>()  
var worker = Seller("Worker0", 20);  
var programmer = Programmer("Lang0", 20)  
for(i in 1..<5){  
    arrWorkers.add(worker);  
    arrWorkers.add(programmer);  
    programmer = Programmer("Lang$i", 20 + i)  
    worker = Seller("Worker$i", 20 + i);  
}  
  
arrWorkers.add(Director("Nick", 50))  
for(i in arrWorkers){  
    i.work()  
    if(i is Cleaner){  
        i.clean()  
    }}
    
    
//На Java выглядело бы следующим образом
if (i instanceof Cleaner){
	Cleaner cleaner = (Cleaner) i;
	i.clean()
}
//На Kotlin это привидение происходит автоматически, это и называется Smart Cast
//Т.к по сути мы имеем коллекцию объектов класса Worker, где каждый элемент коллекции выглядит следующим образом 
val worker = Seller("Bob", 12)

//Java
Worker worker = new Seller(....);
//Поэтому и пришлось использовать Smar Cast

instanceof == is 
//Явное привидение типов в Kotlin
worker as Cleaner
//is, as - операторы

//Также можно переопределять свойства класса
abstract class Transport(open val name: String) 

class Car(override var name: String) : Transport(name)
//теперь для класса Car можно изменять имя
// Но если напишем так, то все равно будет ошибка т.к дочерний класс был приведен к род. классу
val car: Transport = Car()  
val bike: Transport = Bicycle()  
car.name = "Car2"

//Но если напишем так
val car: Transport = Car()  

if(car is Car){  
    car.name = "Car2"  
}  
println(car.name)

//или так, то
val car: Transport = Car()  
if(car !is Car) return   
car.name = "Car2"  

println(car.name)

//то все заработает, т.к будет происходить Smart Cast, во втором случае компилятор будет просто понимать, что если мы не вышли из программы на if значить объект у нас типа Car

//Также примеры Smart Cast
if(car is Car && car.startEngine()){  
    println("")  
}

if(car !is Car || car.startEngine()){  
    println("")  
}
```