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

public class Main{
    public static void main(String[] args){
        Rect rec1 = new Rect(20, 25);
        Rect rec2 = new Rect();

        System.out.println(rec1.squareFigure());
        System.out.println(rec2.squareFigure());

        Triangle tr1 = new Triangle(6, 7, 8);
        Triangle tr2 = new Triangle();

        System.out.println(tr1.squareFigure());
        System.out.println(tr2.squareFigure());

>>>>>>> origin/main
    }
}