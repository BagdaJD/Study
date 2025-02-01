package Tasks.BeOnMax.Inheritance.HomeWork;

public class Box {
    private double a;
    private double b;
    private double c;

    public Box(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Box(){
        a = 5;
        b = 5;
        c = 5;
    }

    public String showInfo(){
        String str = "A = " + a + " ;" + "B = " + b + " ;" + "C = " + c + " ;";

        return  str;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }
}
