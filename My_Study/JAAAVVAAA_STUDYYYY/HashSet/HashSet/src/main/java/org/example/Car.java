package org.example;

public class Car {
    private String brand;
    private int number;

    public Car(String brand, int number){
        this.brand = brand;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Car){
            Car car = (Car) obj;
            return car.brand.equals(this.brand) && number == this.number;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + number;
    }

    public int getNumber() {return number;}
    public String getBrand(){return brand;}
}
