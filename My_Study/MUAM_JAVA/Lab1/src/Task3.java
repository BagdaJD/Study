import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число a:");
        int a = sc.nextInt();

        System.out.println("Введите первое число b:");
        int b = sc.nextInt();
        sc.close();

        System.out.printf("Сумма двух чисел = %s%n", a + b);
        System.out.printf("Разность двух чисел = %s%n", a - b);
        System.out.printf("Умножение двух чисел = %s%n", a * b);
        System.out.printf("Целочисленное деление двух чисел = %s%n", a / b);
        System.out.printf("Остаток от деление двух чисел = %s%n", a % b);
        System.out.printf("Максимальное из двух чисел = %s", Math.max(a, b));
    }
}
