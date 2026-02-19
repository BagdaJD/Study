public class Main {
    public static void main(String[] args) {
        /*
        int a = 1;

        try{
            int b = 7 / a;//Получили исключение, а остальной код игнорируется(ошибка со строкой не спеет вылететь)
            String s = "12kjdhs";
            int i = Integer.parseInt(s);
        }catch(ArithmeticException e) {
            System.out.println("Arith error");
        }catch (Exception e){//Для любой ошибки
            System.out.println("error");
        }finally{
            System.out.println("Мы в блоке finally");
        }

        //в блоке try все выполняется последовательно(если полуим одну ошибку, то и выйдем по ней)
        //остальные будут проигнорированы
        System.out.println("Hello");
         */

        int[] a = new int[10];

        try{
            for(int i = 0; i <= a.length; i++){
                a[i] = i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }
        System.out.println("Lol");
    }
}