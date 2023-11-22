interface Bicycle{
    void applyBrakes(int decrement);
    void speedup(int increment);
}
class avoncylcle implements Bicycle{
    void blowhorn(){
        System.out.println("pee pee peee.....");
    }
    public void applyBrakes(int decrement){
        System.out.println("applying break");
    }
    public void speedup(int increment){
        System.out.println("applying speedup");
    }
}

public class interface2 {
    public static void main(String[] args) {

    }
}
