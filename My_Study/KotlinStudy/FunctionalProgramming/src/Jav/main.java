package Jav;

public class main {
    public static void main(String[] args) {
        Address address1 = new Address("Moscow", "Zelenay", 150);
        Address address2 = new Address("Moscow", "Zelenay", 150);
        if(address1.equals(address2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}
