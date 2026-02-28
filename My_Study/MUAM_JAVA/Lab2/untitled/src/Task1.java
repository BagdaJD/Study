import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод текущега часа
        System.out.println("Введите текущий час:");
        int currHour = sc.nextInt();

        sc.close();
        //вывод конечного результата
        switch(currHour / 6){
            case 0:
                System.out.println("Ночь");
                break;
            case 1:
                System.out.println("Утро");
                break;
            case 2:
                System.out.println("День");
                break;
            case 3:
                System.out.println("Вечер");
                break;
            default:
                System.out.println("Число вне диапозона");
        }
    }
}