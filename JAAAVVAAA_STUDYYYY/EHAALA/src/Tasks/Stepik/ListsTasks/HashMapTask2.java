package Tasks.Stepik.ListsTasks;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();

        int n = sc.nextInt();
        String[] keys = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            String str1 = sc.nextLine();

            keys[i] = str;
            hashMap.put(str, str1);
        }

        int count = 0;
        int mCount = 0;
        String mStr = "";

        for(int i = 0; i < n; i++){
            String key1 = keys[i];
            for(int j = 0; j < n; j++){
                String key2 = keys[j];
                if(hashMap.get(key1).equals(hashMap.get(key2))){
                    count += 1;
                }
            }
            if(count > mCount){
                mCount = count;
                mStr = hashMap.get(key1);
            }
            count = 0;
        }

        System.out.println(mCount);
        System.out.println(mStr);
        for(String key : keys){
            if (hashMap.get(key).equals(mStr)){
                System.out.println(key);
            }
        }
    }
}
