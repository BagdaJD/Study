package Tasks.BeOnMax.Inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public CatFamily(int ears, int legs, boolean bigClaws){
        this.ears = 2;
        this.legs = 4;
        this.bigClaws = true;
    }

    public void showInfo(){
        System.out.printf("Кол-во ушей: " + ears + "; Кол-во лап: " + legs
                + "Наличие больших когтей: " + bigClaws + " ;");
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void eat(){
        System.out.println("Кушаю");
    }
}
