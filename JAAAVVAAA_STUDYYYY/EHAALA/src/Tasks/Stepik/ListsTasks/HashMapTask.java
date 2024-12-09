package Tasks.Stepik.ListsTasks;

import java.util.Scanner;
import java.util.HashMap;
public class HashMapTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>();

        int n = in.nextInt();

        in.nextLine();
        for(int i = 0; i < n; i++){
            String str = in.nextLine();
            hashMap.put(i, str);
        }

        int count = 0;
        int mCount = 0;
        String mStr = "";

        for(int i = 0; i < n; i++){
            String str = hashMap.get(i);
            for(int j = 0; j < n - i; j++){
                if(str.equals(hashMap.get(j))){
                    count += 1;
                }
            }
            if(count > mCount){
                mCount = count;
                mStr = str;
            }
            count = 0;
        }
        System.out.println(mStr);
    }
}
