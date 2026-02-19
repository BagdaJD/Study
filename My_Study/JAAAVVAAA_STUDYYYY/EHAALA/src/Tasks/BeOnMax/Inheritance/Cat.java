package Tasks.BeOnMax.Inheritance;

public class Cat extends CatFamily {
    public Cat(){
        super(2, 4, false);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("вискас");
    }
}
