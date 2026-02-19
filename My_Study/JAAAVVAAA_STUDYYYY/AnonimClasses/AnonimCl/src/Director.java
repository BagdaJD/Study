public class Director {
    public void force(Cookable cookable){
        cookable.cook();
    }

    public void force(Counter counter, int m){
        counter.giveRes(m);
    }
}
