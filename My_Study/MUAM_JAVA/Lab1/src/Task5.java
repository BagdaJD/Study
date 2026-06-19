import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод радиуса
        System.out.println("Введите радиус окружности:");

        double radius = sc.nextDouble();
        sc.close();

        //нахождение длины и площади окружности
        double c = 2 * Math.PI * radius;
        double s = Math.PI * radius * radius;

        //вывод
        System.out.printf("Длина окружности равна %.3f%n", c);
        System.out.printf("Пощадь окружности равна %.3f%n", s);
    }
}
