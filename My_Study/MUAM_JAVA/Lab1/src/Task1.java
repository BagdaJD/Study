import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.next();

        System.out.println("Введите ваше :");
        int age = scanner.nextInt();
        scanner.close();

        System.out.printf("Привет %s! Через 5 лет тебе будет %s лет.", name, age+5);
    }
}