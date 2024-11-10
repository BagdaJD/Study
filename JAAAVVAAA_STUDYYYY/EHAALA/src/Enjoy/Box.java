package Enjoy;

public class Box {
    private double a;
    private double b;
    private double c;

    {
        a = 101;
        b = 202;
        c = 303;
    }
    public Box(){}

    public Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double retSquare(){
        double square = a * b;
        return  square;
    }

    public int srBoxes(Box box1){
        double square1 = retSquare();
        double square2 = box1.retSquare();

        if(square1 > square2){
            return 1;
        }else if (square1 == square2){
            return 0;
        }else{
            return -1;
        }
    }

    public void getSizes(){
        double square = retSquare();
        double ob = square * c;

        System.out.printf("Sizes: (a * b * c) = %s" , ob);
    }

    public double getHeight(){
        return a;
    }

    public double getWeight(){
        return b;
    }

    public double getC(){
        return c;
    }

    public void setC(double c){
        this.c = c;
    }

    public void setHeight(double height){
        this.a = height;
    }

    public void setWeight(double weight){
        this.b = weight;
    }



}
