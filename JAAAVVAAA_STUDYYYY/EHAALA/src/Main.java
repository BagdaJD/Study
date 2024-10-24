import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            arr.add(i);
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}