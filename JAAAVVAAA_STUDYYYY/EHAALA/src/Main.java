import Tasks.BeOnMax.Interface.HomeWork.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Programmer prog1 = new Programmer("Bagda");
        Programmer prog2 = new Programmer("Kolya");
        Programmer prog3 = new Programmer("Sasha");

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(prog1);
        workers.add(prog2);
        workers.add(prog3);

        for(Worker worker : workers){
            worker.voice();
        }

        Cook cook1 = new Cook("Volyadya");
        Cook cook2 = new Cook("Vasyak");
        Cook cook3 = new Cook("Olga");

        Driver driver1 = new Driver("Artem");
        Driver driver2 = new Driver("Tigran");
        Driver driver3 = new Driver("Anna");


        workers.add(cook1);
        workers.add(cook2);
        workers.add(cook3);
        workers.add(driver1);
        workers.add(driver2);
        workers.add(driver3);


    }
}