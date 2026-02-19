package Tasks.Other;

public class Task3_ITMATH {

    private static double fact(int n){
        double x = 1;

        if (n == 0){
            return x;
        }

        for (int i = 1; i <= n; i++){
            x *= i;
        }

        return x;
    }

    public static double FE(int n){
       double x = 1;
       double s = x;

       for (int i = 1; i <= n ; i++){
           x = 1 / fact(i);
           s += x;
       }

        return s;
    }

    public static double Fp4(int n){
        double x = 1;
        double s = x;
        int z = 1;

        for (int i = 1; i <= n ; i++){
            z = -z;
            x = z / (2.0 * i + 1);
            s += x;
        }

        return s;
    }
}
