import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод чисел, операции над ними
        System.out.println("Введите первое число:");
        int firtsNum = sc.nextInt();

        System.out.println("Введите второе число: ");
        int secNum = sc.nextInt();

        System.out.println("Введите желаемую операцию:");
        String operation = sc.next();
        sc.close();

        //Выводим результат необходимой операции
        switch(operation){
            case "+":
                System.out.printf("Сумма двух чисел равна: %s", firtsNum + secNum);
                break;
            case "-":
                System.out.printf("Разность двух чисел(из первого второе): %s", firtsNum - secNum);
                break;
            case "*":
                System.out.printf("Умножение первого числа на второе: %s", firtsNum * secNum);
                break;
            case "/":
                if(secNum == 0){
                    System.out.println("Ошибка: деление на ноль");
                    break;
                }
                System.out.printf("Деление первого числа на второе: %s", firtsNum / secNum);
                break;
            default:
                System.out.println("Введен неверный знак операции");
        }

    }
}
