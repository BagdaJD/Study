package Tasks.BeOnMax.Figures;

public abstract class Figure {
    private double a, b;

    public Figure(double a, double b){
        this.a = a;
        this.b = b;
    }

    public abstract String squareFigure();

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }
}
