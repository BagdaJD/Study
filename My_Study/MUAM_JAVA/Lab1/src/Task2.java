import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите градусы в Целисиях:");

        double celcius = sc.nextDouble();
        sc.close();

        double fereng = celcius * ( 9.0 / 5.0) + 32;
        System.out.printf("%s градусов Цельсия = %.2f градусам по Фаренгейту", celcius, fereng);
    }
}
