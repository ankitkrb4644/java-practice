class circle{
    public int radius;
    circle(int r){    //constructor
        System.out.println("i'm circle parameterised constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
        }
}
class cylinder1 extends circle{  // inheritance
    public int height;
    cylinder1(int r,int h){
        super(r);   //reference of super class
        System.out.println("I am cylinder1 parameter constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
        }
public class practice_inheritance {
    public static void main(String[] args) {
        //problem 1
//        circle obj = new circle(12);
        // cylinder1 obj2 = new cylinder1(12,4);
    }
}
