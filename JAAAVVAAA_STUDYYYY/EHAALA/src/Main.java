import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static String readLine() {
        String str = in.nextLine();
        return str;
    }

    public static int readInt(){
        int num = in.nextInt();
        return  num;
    }

    public static int pirozhki(int n){
        int ans;

        if (n < 20){
            ans = n / 2;
        }else{
            ans = n - 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int answer = pirozhki(n);

        System.out.println(answer);
        /*
        int n = readInt();
        int[] arr = new int[n];
        int x;

        for (int i = 0; i < n; i++){
            x = readInt();
            if (x %2 == 0){
                arr[i] = x;
            }
        }
        int z = n - arr.length;

    */
    }

}
/*  a = 52 b = 54
* 53 > 53 108
*
*  */