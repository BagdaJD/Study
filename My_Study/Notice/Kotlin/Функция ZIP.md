```kotlin
val listOfNumbers = generatePhoneNumbers(1000)  
val listOfNames = generateNames(1000)  

val fullNames = listOfNames.zip(listOfNumbers)

//.zip() - объединяет два списка и возвращает список, содержащий из //пар(pair)(элемент первого списка, элемент второго списка)

for(user in fullNames){  
    println(user)  
}
---------------------
Result:
(Name985, +7-210-313-57-26)
(Name986, +7-881-604-59-41)
(Name987, +7-292-152-43-42)
(Name988, +7-371-881-23-84)
(Name989, +7-492-200-85-26)
(Name990, +7-255-211-68-29)
---------------------
for(user in fullNames){  
    println(user.first + user.second)  
}
//.first, .second - получение первого элемента пары/второго элемента пары


//it.substringBefore(" ") - обрезает строку до определенного символа
//substringAfter(" ") - обрезает строку после определенного символа
```