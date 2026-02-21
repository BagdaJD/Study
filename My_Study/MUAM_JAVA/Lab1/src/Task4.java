import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        int sotni = a / 100;
        int des = a / 10 % 10;
        int edinici = (a % 100) % 10 ;

        int sum = sotni + des + edinici;
        System.out.printf("Сумма сотней, десяток, единиц равна %s", sum);
    }
}
