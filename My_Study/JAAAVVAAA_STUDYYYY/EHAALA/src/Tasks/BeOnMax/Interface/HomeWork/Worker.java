package Tasks.BeOnMax.Interface.HomeWork;

public class Worker {
    private String name;

    public Worker(String name){
        this.name = name;
    }

    public void voice(){
        System.out.println("Имя сотрудника - " +name);
    }

    public String getName(){
        return name;
    }
}
