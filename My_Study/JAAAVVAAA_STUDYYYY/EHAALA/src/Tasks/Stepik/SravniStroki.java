package Tasks.Stepik;

import java.util.Scanner;

public class SravniStroki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(twoWords(s1, s2));
    }

    public static String twoWords(String s1, String s2){
        String res;

        if(s1.length() > s2.length()){
            res = "Первая строка длиннее";
        }else if(s1.length() == s2.length()){
            res = "Равная длина";
        }else{
            res = "Вторая строка длиннее";
        }

        return res;
    }
}
