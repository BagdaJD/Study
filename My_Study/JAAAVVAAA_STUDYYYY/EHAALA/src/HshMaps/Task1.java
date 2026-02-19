package HshMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> myHashMap = new HashMap<>();

        int n = in.nextInt();
        String word = "";
        String word1 = "";
        for(int i = 0; i <= n; i++){
            word = in.nextLine();
            word1 = in.nextLine();

            myHashMap.put(word, word1);
            myHashMap.put(word1, word);
        }

        word1 = in.nextLine();
        System.out.println(word1);

    }
}
