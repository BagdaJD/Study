import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static String readLine() {
        String str = in.nextLine();
        return str;
    }

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = i;
        }

        for (int i : array){
            System.out.println(i);
        }
    }

}
/*  a = 52 b = 54
* 53 > 53 108
*
*  */