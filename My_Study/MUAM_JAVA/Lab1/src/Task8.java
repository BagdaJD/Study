import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод числа
        System.out.println("Введите ваше трехзначное число:");
        int n = sc.nextInt();
        sc.close();

        //переворачивание числа и его вывод
        int newNum = (n % 10)*100 + ((n / 10) % 10) * 10 + n / 100;
        System.out.printf("Новое число перевертыш = %s", newNum);

    }
}
