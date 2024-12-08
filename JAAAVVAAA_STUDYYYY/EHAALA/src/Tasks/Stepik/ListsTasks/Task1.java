package Tasks.Stepik.ListsTasks;

import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrList = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) arrList.add(String.valueOf(i));

        int k = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= k; i++){
            String str = sc.nextLine();
            String[] arr = str.split(" ");

            arrList.add(Integer.parseInt(arr[1]), arr[0]);
        }
        int a = 10;

        for(int i = 0; i < arrList.size(); i++){
            arrList.add(String.valueOf(i));

        }

        for(String str : arrList){
            System.out.print(str + " ");
        }
    }
}
