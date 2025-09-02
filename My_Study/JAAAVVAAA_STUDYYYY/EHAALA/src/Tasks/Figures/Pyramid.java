package Tasks.Figures;

public class Pyramid extends Shape{
    private double square;
    private double height;

    public Pyramid(double s, double h){
        super(s * h * 4 / 3);
        this.height = h;
        this.square = s;
    }
}
