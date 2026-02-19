package Tasks.BeOnMax.Interface;

public class Cat extends Animals implements  CanRun{
    @Override
    public void eat() {
        System.out.println("Ем вискас");
    }

    @Override
    public void run(){
        System.out.println("Коты тоже бегают");
    }
}
