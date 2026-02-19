package Tasks.Other;

public class IvertMass {

    public static int[] invertMass(int[] arr){
        int[] Arr = arr;
        int[] newArr = new int[Arr.length];
        int j = 0;


        for (int i = Arr.length - 1; i >= 0; i--){
            newArr[j] = Arr[i];
            j++;
        }

        return newArr;
    }
//Короче. Сейчас будет тру стори. Я сегодня ночью проснулось и мне хотелось пить.
// И я смотрю - воды дома нету((( Вообще ничего!!! В холодильнике было только пиво,
// поэтому мне пришлось выпить бутылочку в 3 часа ночи и закусить колбаской.
// Вот именно поэтому
// я не могла долго проснуться утром. гиаугрщгцовтцкшцурпгрцаутовшлваоктшищгшрт
// \кутатушшлукв

    /*public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10 + 1);
        }

        //Багдасар не хочет давать мне играть в доту ----> поэтому он какашка последняя....
        // Вообще я если честно в шоке от такого поывеедни я. Это вообще
        // не мужской постпуок я считаю.... Так вот. Поэтому я от боьльшой
        // меланхоличной скуки,я расскажу стих: Вы любите розы? А я на них срал.
        // Стране нужн6ы паравозы! Нам нужен метал! Товарищ, не ахай, не охай!
        // Не дергай узду - коль выполнил план - посылай всех в пизду!не выполнил - с
        // ам иди НАХУЙ!!!!!!
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] userArr = new int[n];
        for (int i = 0; i < n; i++){
            userArr[i] = in.nextInt();
            System.out.println(userArr[i]);
        }

        int[] invArr = invertMass(arr);
        int[] invUserArr = invertMass(userArr);

        for(int i : invArr){
            System.out.println(i);
        }

        System.out.println("Second arr");

        for(int i : invUserArr){
            System.out.println(i);
        }}*/

}
