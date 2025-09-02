package Tasks.Stepik.Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 100000;
        int max = -10000;
        int x = sc.nextInt();

        for (int i = 0; i < n - 1; i++){
            if(x > max){
                max = x;
            }else if(x < min){
                min = x;
            }
            arr[i] = x;
            x = sc.nextInt();
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
