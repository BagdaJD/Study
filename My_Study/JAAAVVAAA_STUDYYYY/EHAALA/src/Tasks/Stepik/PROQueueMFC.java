package Tasks.Stepik;

import java.util.ArrayList;

public class PROQueueMFC {
    private ArrayList<String> queue = new ArrayList<>();

    public void add(String s){
        queue.add(s);
        System.out.printf("%s в очереди", s);
    }

    public void remove(){
        queue.remove(0);
        System.out.printf("%s в обработке", queue.get(0));
    }

    public void zanimal(String name1, String name2, int f){
        if(f == 1){
            queue.add(0, name1);
        } else if (queue.contains(name2) && f == 0) {
            int first = queue.indexOf(name2);
            queue.add(first + 1, name1);
        }else{
            queue.add(name2);
            System.out.printf("%s не надо тут ля-ля", name1);
        }

    }

    public void checkQueue(String s){
        if (queue.size() < 5){
            queue.add(s);
        }else{
            System.out.println("Слабак");
        }
    }

    public void showQueue(){
        for (String s : queue){
            System.out.print(s);
        }
    }

    public String get(int i){
        return queue.get(i);
    }

}
