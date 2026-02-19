public class Counterer implements Counter{
    @Override
    public void giveRes(int m){
        System.out.printf("Отчет за " + m + " месяцев");
    }
}
