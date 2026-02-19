package Tasks.BeOnMax.Interface;

public class Dog extends Animals implements  CanRun{
    @Override
    public void eat() {
        System.out.println("Грызу кость");
    }

    @Override
    public void run(){
        System.out.println("Собака бежит");
    }
}
