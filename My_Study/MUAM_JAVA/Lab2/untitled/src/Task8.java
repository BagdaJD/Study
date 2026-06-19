import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ввод размера двумерного массива
        System.out.println("Введите размер двумерного массива:");
        int size = sc.nextInt();
        sc.close();

        //Инициализация матрицы и массивов сумм строк и столбцов
        int[][] matr = new int[size][size];
        int[] sumRows = new int[size];
        int[] sumCols = new int[size];

        //суммы главной и побочной диагонали
        int sumMainDiag = 0;
        int sumPobDiag = 0;

        //Заполняем и выводим двумерный массив
        for (int i = 0; i < size; i++) {
            System.out.print("[");
            for(int j = 0; j < size; j++){
                int value = (int) (Math.random() * 9 + 1);
                matr[i][j] = value;

                System.out.printf("%d, ", matr[i][j]);
                //считаем сумму данной строки, суммы по столбцам
                sumRows[i] += value;
                sumCols[j] += value;

                //считаем суммы диагоналей
                if(i == j) sumMainDiag += value;
                if(i + j == size - 1) sumPobDiag += value;
            }
            System.out.printf("]%n");
        }

        boolean flag = true;
        int sumFirstStr = sumRows[0];
        //Проверка на условие для диагональных сумм
        if(sumFirstStr != sumMainDiag || sumFirstStr != sumPobDiag){
            flag = false;
        }else{
            //проверка сумм строк и столбцов
            for (int i = 0; i < size; i++) {
                if(sumFirstStr != sumRows[i] || sumFirstStr != sumCols[i]){
                    flag = false;
                    break;
                }
            }
        }

        //вывод
        if(flag){
            System.out.println("Да, это магический квадрат");
        }else{
            System.out.println("Нет, это не магический квадрат");
       }
        //Второй способ
//        //Заполняем и выводим матрицу
//        for(int i = 0; i < size; i++){
//            System.out.print("[");
//            for(int j = 0; j < size; j++){
//                matr[i][j] = (int) (Math.random() * 9 + 1);
//                System.out.printf("%d, ", matr[i][j]);
//            }
//            System.out.printf("]%n");
//        }
//
//        //считаем сумму первой строки
//        int sumFirstStr = 0;
//        for(int num : matr[0]){
//            sumFirstStr += num;
//        }
//
//        boolean flag = true;
//        //считаем сумму всех последующих строк
//        for(int i = 1; i < size; i++){
//           int sumStr = 0;
//           for(int j = 0; j < size; j++){
//               sumStr += matr[i][j];
//           }
//           if(sumStr != sumFirstStr){
//               flag = false;
//               break;
//           }
//        }
//
//        //считаем сумму всех последующих столбцов
//        if(flag){
//            for(int i = 0; i < size; i++){
//                int sumCol = 0;
//                for (int j = 0; j < size; j++){
//                    sumCol += matr[j][i];
//                }
//                if(sumCol != sumFirstStr) {
//                    flag = false;
//                    break;
//                }
//            }
//        }
//        //считаем сумму диагоналей
//        if(flag){
//            int sumMainDiag = 0;
//            int sumPobDiag = 0;
//            for(int i = 0; i < size; i++){
//                sumMainDiag += matr[i][i];
//                sumPobDiag += matr[i][size - 1 - i];
//            }
//            if(sumMainDiag != sumFirstStr || sumPobDiag != sumFirstStr){
//                flag = false;
//            }
//        }
//
//        //вывод
//        if(flag){
//            System.out.println("Да, это магический квадрат");
//        }else{
//            System.out.println("Нет, это не магический квадрат");
//        }

    }
}
