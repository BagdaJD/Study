```kotlin
val average = total.average() //выдает среднее значение по списку
---------
val revenueByWeek = listOf(  
listOf(8, 5, 3, 1, 2),  
listOf(7, 5, 3, 1, 2),  
listOf(8, 5, 3, 1, 2),  
listOf(8, 5, 3, 1, 2)  
)  
val total = revenueByWeek.flatten()  
//total = [8, 5, 3, 1 , 2, 7 ..]
val average = total.average()
---------
.flatten() //распакует все списки в один список
.flatMap{it} //в данном случае сделает тоже самое
---------
val data = mutableMapOf<String, List<Int>>()  
data["file1"] = listOf(15, 20, 30, 40)  
data.put("file2", listOf(35, 60, 30, 43))  
data.put("file3", listOf(45, 70, 21, 40))

//data["file1"] = listOf(15, 20, 30, 40) = data.put("file1", listOf(15, 20, 30, 40))
//Удобно)

//Желательно неиспользовать мутабельный тип

val data = mapOf<String, List<Int>>(  
    "file1" to listOf(15, 20, 30, 40),  
    "file2" to listOf(35, 60, 30, 43),  
    "file3" to listOf(45, 70, 21, 40)  
)
//Еще один способ задания map

Pair("File4", listOf(3, 1, 4, 4)) //и еще один способ
---------
val data = mapOf<String, List<Int>>(  
    "file1" to listOf(15, 20, 30, 40),  
    "file2" to listOf(35, 60, 30, 43),  
    "file3" to listOf(45, 70, 21, 40)  
)  
val average = data.flatMap{it.value}.average()  
val aver1 = data.map { it.value }
//.flatMap{} в данном случае возьмет listOf(), т.к он является значением и распакует его(добавит в общий список) и так с каждым элементом
//,map{} в данном случаем просто будет брать и копировать списки в aver1, и в итоге, получим список списков
---------
val average = data.filter{it.value.all{it >=0}}.flatMap{it.value}.average()

//.all{} - проверяет элементы списка на какое-то условие и оставляет список, если true
//.any{} - проверяет есть ли хотя бы элемент удовлетворяющий условию
//.filter{} - анонимная функция внутри .filter{} должна вернуть true/false
//если true, то проходят, иначе нет
//.filterNot{} - наоборот, оставляет если false
```