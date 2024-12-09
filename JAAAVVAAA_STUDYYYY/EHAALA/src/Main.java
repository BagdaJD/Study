import java.util.Scanner;
<<<<<<< HEAD
import Tasks.Stepik.PROQueueMFC;
=======
import Tasks.Stepik.Queue.PROqueueMFC;

>>>>>>> origin/main
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

<<<<<<< HEAD
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        PROQueueMFC queue = new PROQueueMFC();
        for(int i = 0; i < n; i++){
            String str = in.nextLine();
            String[] strArr = str.split(" ");
            String init = "";
            int k = strArr.length;

            if (k == 1){//Следующий
                init = queue.get(0);
                queue.remove();
            }else if(k == 4){//Занимал
                int f = 0;
                if (init.equals(strArr[3])){
                    f = 1;
                }
                queue.zanimal(strArr[0], strArr[3], f);
            }
        }
=======
>>>>>>> origin/main

    }
}

/*  a = 52 b = 54
* 53 > 53 108
*
*  */