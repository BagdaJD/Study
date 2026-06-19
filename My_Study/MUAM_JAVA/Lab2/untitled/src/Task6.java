import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ввод размера массива
        System.out.println("Введите размер массива:");

        int size = sc.nextInt();
        sc.close();

        int[] arr = new int[size];

        int countPos = 0;
        int countNeg = 0;
        int countZeroes = 0;
        //Заполняем массив и находим кол-во положительных, отрицательных чисел
        //а также 0
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 21) - 10;
            System.out.print(arr[i] + " ");
            if(arr[i] > 0){
                countPos++;
            }else if(arr[i] < 0){
                countNeg++;
            }else{
                countZeroes++;
            }
        }
        System.out.println();

        //вывод
        System.out.printf("Кол-во положительных чисел: %d%n", countPos);
        System.out.printf("Кол-во отрицательных чисел: %d%n", countNeg);
        System.out.printf("Кол-во нулей: %d", countZeroes);
    }
}
