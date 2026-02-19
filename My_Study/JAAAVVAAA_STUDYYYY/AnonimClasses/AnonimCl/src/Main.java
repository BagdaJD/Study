public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Counterer counterer = new Counterer();

        director.force(counterer, 10);
        director.force(new Counter() {
            @Override
            public void giveRes(int m) {
                System.out.println("Отчет за " + m + " месяцев");
            }
        }, 11);
    }
}