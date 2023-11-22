interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
class AvonCycle implements Bicycle{
    void BlowHorn(){
        System.out.println("pee pee peee.....");
    }
    public void applyBrake(int decrement){
        System.out.println("applying break");
    }
    public void speedup(int increment){
        System.out.println("applying speedup");
    }
}

public class interface2 {
    public static void main(String[] args) {
        AvonCycle cycleAnkit = new AvonCycle();
        //you can create properties in interfaces
        cycleAnkit.applyBrake(4);
        //you cannot modify the properties in interfaces as they are final
//        cycleAnkit.a= 454;
        System.out.println(cycleAnkit.a);
    }
}
