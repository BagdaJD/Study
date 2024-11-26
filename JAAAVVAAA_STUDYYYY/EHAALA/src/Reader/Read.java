package Reader;

import java.util.Scanner;

public class Read {
    private static Scanner in = new Scanner(System.in);

    public static int readInt(){
        int a = in.nextInt();

        return a;
    }

    public static double readDouble(){
        double a = in.nextDouble();

        return a;
    }

    public static String readStr(){
        String str = in.nextLine();

        return str;
    }
}
