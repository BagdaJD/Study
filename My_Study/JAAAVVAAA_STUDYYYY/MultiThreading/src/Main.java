import java.util.Random;

public class Main {

    static boolean isFind = false;
    public static void main(String[] args) {
        int randInt = (int) (Math.random() * 1000000) + 1;
        Thread timer1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    int i = 0;
                    while(!isFind){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                    System.out.printf("RandInt = %s", randInt);
                }catch(Exception e){
                    System.out.println("Error");
                }
            }
        });
        timer1.start();
        Thread timer2 = new Thread(new Runnable(){
            @Override
            public void run(){
                int maybeDig = (int) (Math.random() * 1000000) + 1;
                while(maybeDig != randInt){
                    maybeDig = (int) (Math.random() * 1000000) + 1;
                }
                isFind = true;
            }
        });
        timer2.start();
    }
}