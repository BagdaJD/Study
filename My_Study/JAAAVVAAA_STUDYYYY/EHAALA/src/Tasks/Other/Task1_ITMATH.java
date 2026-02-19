package Tasks.Other;

public class Task1_ITMATH {

    public static double fact(double n){
        double res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }

        return res;
    }

    public static double factR(double n) throws StackOverflowError{
        double res = 1;

        if(n == 0){
            return 1;
        }
        return n * factR(n - 1);
    }
}
