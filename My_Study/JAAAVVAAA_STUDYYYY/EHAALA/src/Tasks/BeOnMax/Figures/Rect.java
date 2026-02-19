package Tasks.BeOnMax.Figures;

public class Rect extends Figure{
    public Rect(double a, double b){
        super(a, b);
    }

    public Rect(){
        super(10, 15);
    }

    @Override
    public String squareFigure(){
        String str = "Площадь" + "прямоугольника = " + super.getA() * super.getB();

        return  str;
    }
}
