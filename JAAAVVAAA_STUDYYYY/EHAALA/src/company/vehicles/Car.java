package company.vehicles;
import company.professions.Driver;
import company.details.Engine;

public class Car {
    private String marka;
    private String klass;

    private  double ves;
    private Driver driver;
    private Engine engine;

    public Car(String marka, String klass, double ves, Driver driver, Engine engine){
        this.marka = marka;
        this.klass = klass;
        this.ves = ves;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void start(int n){
        System.out.println("Поехали");
    }
}
