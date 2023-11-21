public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
        derived1 b1 = new derived1();
    }
}
class Base1{
    Base1(){
        System.out.println("I'm a constructor");
    }
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}
class derived1 extends Base1{

//    derived1(){
//        System.out.println("I'm a constructor");
//    }
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

