package BeOnMax.DZ;

public class Man {
    private String name;
    private int age;
    private double height;
    private String job;

    public Man(String name, String job, int age, double height){
        this.name = name;
        this.job = job;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public String getJob(){
        return job;
    }
    public int getAge(){
        return age;
    }
    public Double getHeight(){
        return height;
    }
}
