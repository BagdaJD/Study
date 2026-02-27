import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод числа
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        //разбиение на сотни, десятки, единицы
        int sotni = a / 100;
        int des = a / 10 % 10;
        int edinici = (a % 100) % 10 ;

        //сумма разрядов
        int sum = sotni + des + edinici;
        //вывод
        System.out.printf("Сумма сотней, десяток, единиц равна %s", sum);
    }
}
