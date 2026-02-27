import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ввод имени
        System.out.println("Введите ваше имя:");
        String name = scanner.next();

        //ввод возраста
        System.out.println("Введите ваш возраст :");
        int age = scanner.nextInt();
        scanner.close();
        //конечный вывод
        System.out.printf("Привет %s! Через 5 лет тебе будет %s лет.", name, age+5);
    }
}