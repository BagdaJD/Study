package Tasks.Stepik;

import java.util.Scanner;
import java.util.ArrayList;

public class SortString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(sortByLength(s));
    }

    public static String sortByLength(String s){
        ArrayList<String> arrList = new ArrayList<>();
        String swap = "";
        for(int i = 0; i < s.split(" ").length; i++){
            arrList.add(s.split(" ")[i]);
        }

        for(int i = 0; i < arrList.size(); i++){
            for(int j = 0; j < arrList.size() - i - 1; j++){
                if(arrList.get(j).length() > arrList.get(j + 1).length() ||
                        (arrList.get(j).length() == arrList.get(j + 1).length() &&
                                arrList.get(j).charAt(0) == arrList.get(j + 1).charAt(0))){
                    swap = arrList.get(j);
                    arrList.set(j, arrList.get(j + 1));
                    arrList.set(j + 1, swap);
                }else if(arrList.get(j).length() == arrList.get(j + 1).length()){
                    if(arrList.get(j).charAt(0) < arrList.get(j + 1).charAt(0)){
                        swap = arrList.get(j);
                        arrList.set(j, arrList.get(j + 1));
                        arrList.set(j + 1, swap);
                    }else{
                        swap = arrList.get(j + 1);
                        arrList.set(j + 1, arrList.get(j));
                        arrList.set(j, swap);
                    }
                }
            }
        }
        String res = String.join(" ", arrList);
        return res;
    }
}
