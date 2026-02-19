package org.example;

public class Example {

    public static void main(String[] args) {

        String[] src = { "Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] dest = { "January", "February", "March", "April", "May", "June", "July", "August"};

        int srcIndex = 2;
        int destIndex = 3;
        int len = 2;

        System.out.println("len : " + len);
        System.out.println("srcIndex : " + srcIndex);
        System.out.print("src : ");

        for (int i = 0; i < src.length; i++)
            System.out.print(src[i] + " ");
        System.out.println("");

        System.out.println("destIndex : " + destIndex);

        System.out.print("dest : ");
        for (int i = 0; i < dest.length; i++)
            System.out.print(dest[i] + " ");
        System.out.println("");

        //len = 2; srcIndex = 2; destIndex = 3;
        //src = Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        //dest = January February March April May June July August
        System.arraycopy(src, srcIndex, dest, destIndex, len);






        System.out.print("final destination array : ");
        for (int i = 0; i < dest.length; i++)
            System.out.print(dest[i] + " ");
    }
}
