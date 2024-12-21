package Tasks;

import java.util.Scanner;

public class minSwapMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double max = -100000;
        double min = 100000;
        int maxIndex = 0;
        int minIndex = 0;
        double[] arr = new double[n];

        for(int i = 0; i < n; i++){
            double x = sc.nextDouble();
            arr[i] = x;
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }else if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        double swap = min;
        arr[minIndex] = max;
        arr[maxIndex] = swap;

        for(double i : arr){
            System.out.print(i + " ");
        }
    }

}
