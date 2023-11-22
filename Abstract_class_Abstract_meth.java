abstract class Parent2{
      Parent2(){
          System.out.println("i'm constructor of Base2");
    }
    public void sayHello(){
          System.out.println("hello");
    }
    abstract public void greet();
}
class Child2 extends Parent2{
    public void greet(){
     System.out.println("Good morning");
 }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println(" i am good");
    }
}
public class Abstract_class_Abstract_meth {
    public static void main(String[] args) {

    }
}
