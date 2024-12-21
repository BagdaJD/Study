package Tasks;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        simple(a);
        simple(b);
        simple(c);
    }

    public static void simple(int num){
        int d;
        String flag = "YES";
        for(int i = 2; i < num; i++){
            d = i;
            if(num % d == 0){
                flag = "NO";
                break;
            }
        }
        System.out.println(flag);
    }
}
