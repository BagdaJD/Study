package Tasks;

import Tasks.Task1_ITMATH;

public class Task2_ITMATH {

    public static void main(String[] args) {
        double[] arr = new double[10000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        double res;
        try {
            for (int i = 0; i < arr.length; i++){
                res = Task1_ITMATH.fact(arr[i]);
                System.out.printf();
            }
        }
    }
}
