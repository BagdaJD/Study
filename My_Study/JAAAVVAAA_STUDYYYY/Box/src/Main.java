public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            int rand = (int) (Math.random()  * 100) + 1;
            if(rand < 10){
                while (rand < 10){
                    rand = (int) (Math.random() * 100) + 1;
                }
            }
            System.out.printf("Random digit = %s;", rand);
            System.out.println();
        }
    }
}