package Enjoy;

public class Bagdasar extends Jobs implements Work{
    private String study;
    private String age;
    private String firstName;

    public Bagdasar(String firstName,String name, String study,String dol, double salary){
        super(name, dol, salary);
        this.firstName = firstName;
        this.study = study;
    }

    public Bagdasar(String name, String dol, double salary, String study, String age){
        super(name, dol, salary);
    }

    @Override
    public void work(){
        System.out.printf("%s now is working on %s", firstName, getName());
    }


}
