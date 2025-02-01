package Tasks.BeOnMax.Inheritance.HomeWork;

public class BoxWeight extends Box{
    private double weight;

    public BoxWeight(double a, double b, double c, double weight){
        super(a, b, c);
        this.weight = weight;
    }

    public BoxWeight(){
        super();
        weight = 100;
    }

    public BoxWeight(Box box){
        super(box.getA(), box.getB(), box.getC());
        weight = box.getA() + box.getB() + box.getC();
    }
    @Override
    public String showInfo(){
        String str = super.showInfo() + "Вес коробки = " + weight + " ;";

        return str;
    }
}
