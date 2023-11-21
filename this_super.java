class ekclass{
    int a;
    public int getA(){
        return a;
    }
    ekclass(int a) {
    this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
public class this_super {
    public static void main(String[] args) {
        ekclass e =new ekclass(4);
        System.out.println(e.getA());
    }
}
