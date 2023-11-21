public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        derived1 b1 = new derived1();
//        derived1 b2 = new derived1 ( 14, 9);
        Childofderived c = new  Childofderived( 12,13,15);
    }
}
class Base1{
    Base1(){
        System.out.println("I'm a constructor");
    }
    Base1(int x){
        System.out.println("i am a overloaded constructor with value of a as:"+x );
    }
}
class derived1 extends Base1 {
    derived1() {
        super(0);
        System.out.println("I'm a  derived class constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("i am overloaded constructor of derived with value of y as:"+y);
    }
}
class Childofderived extends derived1{
    Childofderived(){
        System.out.println("i am a child of derived constructor");
    }
    Childofderived(int x, int y,int z){
        super(x,y);
        System.out.println("i am overloaded constructor of derived with value of z as:"+z);
    }
}

