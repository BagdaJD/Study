import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время в минутах:");
        int minutes = sc.nextInt();
        sc.close();

        int hours = minutes / 60;
        int ostMinutes = minutes % 60;

        System.out.printf("%s ч. %s мин.", hours, ostMinutes);
    }
}
