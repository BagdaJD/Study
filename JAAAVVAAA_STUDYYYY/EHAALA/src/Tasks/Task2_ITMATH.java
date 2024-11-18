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
                res = Task1_ITMATH.factR(arr[i]);
                System.out.printf("%s %s", i, res);
                System.out.println();
            }
        }catch(Exception e){
            System.out.println("Переполнение памяти");
        }
    }
}
