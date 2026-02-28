import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int numOfMonth = sc.nextInt();
        sc.close();

        switch(numOfMonth){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 день в этом месяце");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 день в этом месяце");
                break;
            case 2:
                System.out.println("28 или 29 дней");
                break;
            default:
                System.out.println("Введен некорректный месяц");
        }
    }
}
