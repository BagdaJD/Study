package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[11];

        try{
            arr[11] = 10;
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Wow");
        }
    }
}