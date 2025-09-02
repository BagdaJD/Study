package Tasks.Stepik.Tasks;

import java.util.Scanner;

public class Task3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = 0;
        while (n != 0){
            if(n % 3 == 0 && n > m){
                m = n;
            }
            n = sc.nextInt();
        }
        if(m == 0){
            System.out.println("404");
        }else{
            System.out.println(m);
        }
    }
}
