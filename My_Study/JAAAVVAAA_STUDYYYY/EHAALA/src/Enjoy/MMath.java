package Enjoy;

public class MMath {
    public static double module(double a){
        double A = a;

        if (A < 0) A = -A;

        return A;
    }

    public static int module(int a){
        int A = a;

        if (A < 0) A = -A;

        return A;
    }

    public static int okrug(double num) {
        double Num = num;
        int iNum = (int) Num;
        double lNum = iNum;
        double rNum = iNum + 1;

        if (module(Num - lNum) > module(Num - rNum)){
            iNum += 1;
        }

        return iNum;
    }

}
