```kotlin
//Month
package Months  
  
enum class Month {  
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGHUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER  
}

//main.kt
val month = SEPTEMBER  
val season = when(month){  
    DECEMBER, JANUARY, FEBRUARY -> println("Winter")  
    MARCH, APRIL, MAY -> println("Spring")  
    JULY, JUNE, AUGHUST -> println("Summer")  
    SEPTEMBER, OCTOBER, NOVEMBER -> println("Autumn")  
}
//Упрощает работу с перечислением данных + исключает случай ошибки неправильного написания, а следовательно блока else
```