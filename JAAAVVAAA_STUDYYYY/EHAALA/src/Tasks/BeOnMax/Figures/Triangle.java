package Tasks.BeOnMax.Figures;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{
    private double c;

    public Triangle(double a, double b, double c){
        super(a, b);
        this.c = c;
    }

    public Triangle(){
        super(3, 4);
        c = 5;
    }

    @Override
    public String squareFigure(){
        double p = (super.getA() + super.getB() + c) / 2;
        double square = sqrt(p * (p - super.getA()) * (p - super.getB()) * (p - c));
        String str = "Площадь " + "треугольника = " + square;

        return  str;
    }
}
