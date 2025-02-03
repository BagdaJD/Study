package Tasks.BeOnMax.Interface;

public class Bird extends Animals implements CanRun, Flyable{
    @Override
    public void run() {
        System.out.println("Птица бежит");
    }

    @Override
    public void eat() {
        System.out.println("Ем птичий корм");
    }

    @Override
    public void fly(){
        System.out.println("Птица летит");
    }
}
