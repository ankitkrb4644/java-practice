class second_Class{
    int a;
    public int getA(){
        return a;
    }
    second_Class(int a) { //constructor
    this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends second_Class{
DoClass(int c){
    super(c);
    System.out.println("i'm a constructor");
}
}
public class this_super {
    public static void main(String[] args) {
        second_Class e =new second_Class(4);
        System.out.println(e.getA());
        DoClass d = new DoClass(5);
    }
}
