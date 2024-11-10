package Enjoy;

public class Jobs {
    private String name ;
    private String dol;
    private double salary;
    private double ages;
    private double procent;

    {
        name = "Worker";
        dol = "Worker";
        salary = 1234;
    }

    public Jobs(String name, String dol, double salary){
        this.name = name;
        this.dol = dol;
        this.salary = salary;
    }

    public void sayHello(){
        System.out.printf("Name: %s; Dolzhnost: %s; Salary: %s;", name, dol, salary);
    }

    private double localRashet(){
        double rashet = 12 * salary;
        return rashet;
    }

    public double nalog(int ages, int procent){
        this.ages = ages;
        this.procent = procent;
        double rashet = localRashet() * ages;

        procent = procent / 100;
        double nalog = rashet * procent;

        return nalog;
    }


    public String getName(){
        return name;
    }
}
