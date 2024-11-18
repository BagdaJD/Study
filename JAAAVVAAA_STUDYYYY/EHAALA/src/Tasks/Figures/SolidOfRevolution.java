package Tasks.Figures;

public class SolidOfRevolution extends Shape{
    private double radius;

    public SolidOfRevolution(double volume, double radius){
        super(volume);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
