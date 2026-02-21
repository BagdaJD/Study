import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности:");

        double radius = sc.nextDouble();
        sc.close();

        double c = 2 * Math.PI * radius;
        double s = Math.PI * radius * radius;

        System.out.printf("Длина окружности равна %.3f%n", c);
        System.out.printf("Пощадь окружности равна %.3f%n", s);
    }
}
