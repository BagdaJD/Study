import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод времени
        System.out.println("Введите время в минутах:");
        int minutes = sc.nextInt();
        sc.close();

        //разбиение на часы и оставшиеся минуты
        int hours = minutes / 60;
        int ostMinutes = minutes % 60;

        //вывод
        System.out.printf("%s ч. %s мин.", hours, ostMinutes);
    }
}
