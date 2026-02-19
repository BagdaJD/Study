package Tasks.Stepik;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(simple(a));
        System.out.println(simple(b));
        System.out.println(simple(c));
    }

    public static String simple(int num){
        int d;

        if(num == 1){
            return "NO";
        }else {
            for(int i = 2; i < num; i++){
                d = i;
                if(num % d == 0){
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
