<<<<<<< HEAD
<<<<<<< HEAD
import BeOnMax.MyArrayList.MyArrayList;
import BeOnMax.DZ.Man;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> a = new MyArrayList<>();

        for (int i = 0; i < 30; i++) {
            a.add(Integer.valueOf(i));
        }
        
=======
import Tasks.BeOnMax.Inheritance.HomeWork.*;
import Tasks.BeOnMax.Figures.*;
=======
import Tasks.BeOnMax.Interface.HomeWork.*;
import java.util.ArrayList;
>>>>>>> origin/main

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

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }


>>>>>>> origin/main
    }
}