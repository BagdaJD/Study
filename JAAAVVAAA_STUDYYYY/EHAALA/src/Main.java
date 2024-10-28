import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 12, 13);
        Box box2 = new Box(4, 5, 6);

        System.out.println(box1.srBoxes(box2));
    }
}