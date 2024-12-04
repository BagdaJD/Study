import java.util.ArrayList;
import java.util.Scanner;
import Tasks.Stepik.PROQueueMFC;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static String readLine() {
        String str = in.nextLine();
        return str;
    }

    public static int readInt() {
        int num = in.nextInt();
        return num;
    }

    public static int pirozhki(int n) {
        int ans;

        if (n < 20) {
            ans = n / 2;
        } else {
            ans = n - 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] keys = {"Добавить", "Посмотреть"};

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        PROQueueMFC queue = new PROQueueMFC();
        for(int i = 0; i < n; i++){
            String str = in.nextLine();
            int k = str.split(" ").length;
        }

    }
}

/*  a = 52 b = 54
* 53 > 53 108
*
*  */