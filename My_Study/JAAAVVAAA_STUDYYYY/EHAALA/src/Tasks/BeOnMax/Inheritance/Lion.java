package Tasks.BeOnMax.Inheritance;

public class Lion extends CatFamily{
    public Lion(){
        super(2, 4, true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("антилопу");
    }
}
