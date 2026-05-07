```kotlin
//Поднимаем следующую проблему
//DataBase.kt
val name = "main.db"  
val version = 1  
val data = mutableListOf<String>()  
  
fun insertData(str: String) {  
    data.add(str)  
}

//Main.kt
val db = DataBase()  
db.insertData("1")  
db.insertData("2")  
val test = Test()  
test.insertTestData("3")  
test.insertTestData("4")  
for(str in db.data){  
    println(str)  
}

//Test.kt
fun insertTestData(str: String){  
    DataBase().insertData(str)  
}

//И дело в том, что "3", "4" не добавится в переменную db, т.к идет добавление из разных классов и их объектов
/*Вместо одной общей корзины для данных, теперь у каждого вызова своя собственная "коробка".

1. val db = DataBase() — Ты создаешь Объект №1. В его список data ты добавляешь "1" и "2".
    
2. test.insertTestData("3") — Внутри этого метода ты снова пишешь `DataBase().insertData("3").
    
    - Ключевое слово DataBase() (со скобками) создает Объект №2. 
    - Тройка добавляется в список Объекта №2.  
    - Как только метод завершается, Объект №2 забывается (удаляется из памяти), так как на него больше нет ссылок.  
3. test.insertTestData("4") — Создается Объект №3. Туда падает "4", и объект так же исчезает.*/
-------------------
//Создание синглтона
//main.kt
fun main(){  
    val db = DataBase.getInstance()  
    db.insertData("1")  
    db.insertData("2")  
    val test = Test()  
    test.insertTestData("3")  
    test.insertTestData("4")  
    for(str in db.data){  
        println(str)  
    }}


//test.kt
class Test {  
    fun insertTestData(str: String){  
        DataBase.getInstance().insertData(str)  
    }}


//database.kt
class DataBase private constructor(){  
    val name = "main.db"  
    val version = 1  
    val data = mutableListOf<String>()  
  
    fun insertData(str: String) {  
        data.add(str)  
    }    
    companion object{  
        var db : DataBase? = null  
        fun getInstance() : DataBase {  
            db?.let{  
                return it  
            }  
            val instance = DataBase()  
            db = instance  
  
            return instance  
        }  
    }}
    
//сделали конструктор приватным, чтобы извне нельзя было обращаться
//добавили companion object, чтобы дать доступ к созданию объектов(безопасному), а для того, чтобы бесконечно не плодить объекты database, создали следующую реализацию(представленной в статическом блоке кода)
//Тот же самый синглтон, только по котлиновски
object Database{  
    val name = "main.db"  
    val version = 1  
    val data = mutableListOf<String>()  
  
    fun insertData(str: String) {  
        data.add(str)  
    }}
    
//По факту синглтон - это объект, с которым работают сразу несколько классов
```