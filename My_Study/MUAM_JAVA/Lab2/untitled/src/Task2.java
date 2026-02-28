import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        // ввод длины массива
        int lenArr = sc.nextInt();
        sc.close();

        int[] arr = new int[lenArr];
        int sumArr = 0;

        //считаем сумма массива и выводим его элементы
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 50 + 1);
            sumArr += arr[i];
            System.out.println(arr[i]);
        }
        //считаем сред.арифметическое и выводим все результаты
        double sredArith = (double) sumArr / arr.length;

        System.out.printf("Сумма всех элементов массива: %s%n", sumArr);
        System.out.printf("Среднее арифметическое массива: %.2f", sredArith);
    }
}
