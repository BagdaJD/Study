```java
//Если хэшкоды у объектов разные, то объекты разные. Но если хэшкод совпал, то эти объекты не факт, что одинаковые
//Если переопределил equals - то переопредели hashcode()
@Override  
public boolean equals(Object obj) {  
    if(this == obj){  //сравнение ссылок
        return true;  
    }    if(hashCode() != obj.hashCode()){  
            return false;  
}  
    if(obj instanceof Address){  //нормальная проверка объектов
        Address address = (Address) obj;  
        return this.city.equals(address.city) && this.street.equals(address.street) && (this.numberOfHouse == address.numberOfHouse);  
    }else{  
        return false;  
    }}
    @Override  
public int hashCode() {  
    return city.hashCode() + street.hashCode() + numberOfHouse;
//hashcode() есть у любого ссылочного класса, у примитивных классов, например, как int он равен самому числу
//Если в Java == - сравнение ссылок, equals() - сравнение объектов, то в Kotlin  
// == - сравнение объектов, === - сравнение ссылок 
```