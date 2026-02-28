import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ввод размера массива
        System.out.println("Введите размер массива:");
        int lenArr = sc.nextInt();
        sc.close();

        int[] arr = new int[lenArr];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indMax = -1;
        int indMin = -1;

        //Заполняем массив и находим минимальное и максимальное значения
        for(int i = 0; i < lenArr; i++){
            arr[i] = (int) (Math.random() * 101) - 50;
            System.out.print(arr[i] + " ");

            if(arr[i] > max){
                max = arr[i];
                indMax = i;
            }
            if(arr[i] < min){
                min = arr[i];
                indMin = i;
            }
        }
        System.out.println();

        //вывод
        System.out.printf("Максимальное число с индексом %d = %d%n", indMax, max);
        System.out.printf("Минимльное число с индексом %d = %d", indMin, min);
    }
}
