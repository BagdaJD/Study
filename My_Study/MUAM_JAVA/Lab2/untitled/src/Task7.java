import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Ввод числа
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 10:");
        int num = sc.nextInt();
        sc.close();

        //Вывод таблицы умножения
        for(int i = 1; i <= num; i++){
            System.out.printf("%d * %d = %d%n", i, num, i * num);
        }
    }
}
