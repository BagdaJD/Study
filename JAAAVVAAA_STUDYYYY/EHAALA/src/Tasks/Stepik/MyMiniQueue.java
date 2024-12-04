package Tasks.Stepik;

import java.util.ArrayList;
import java.util.Scanner;

import static Reader.Read.*;

public class MyMiniQueue {
    private ArrayList<String> tracks = new ArrayList<>();

    private void addTrack(String nameTrack){
        tracks.add(nameTrack);
    }

    public void removeTrack(){
        System.out.printf("Воспроизводится %s" ,tracks.get(0));
        System.out.println();
        tracks.remove(0);
    }

    public ArrayList<String> getTracks(){
        return tracks;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MyMiniQueue myque = new MyMiniQueue();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String str = readStr();
            String[] strArr = str.split(" ");

            if(strArr.length == 2){
                myque.addTrack(strArr[1]);
            }else{
                myque.removeTrack();
            }
        }

        for(String s : myque.getTracks()){
            System.out.println(s);
        }
    }

}
