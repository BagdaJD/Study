import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод координат двух точек по x и y
        System.out.println("Введите координату первой точки по x");
        double x1 = sc.nextDouble();

        System.out.println("Введите координату первой точки по y");
        double y1 = sc.nextDouble();

        System.out.println("Введите координату второй точки по x");
        double x2 = sc.nextDouble();

        System.out.println("Введите координату второй точки по y");
        double y2 = sc.nextDouble();
        sc.close();

        //Нахождение и вывод расстояния между точками
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Расстояние между точками равно = %s", d);
    }
}
