class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //default constructor
//    student(){
//    System.out.println("constructor called");
//    }
    //parameterized constructor
    student( String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class constructor {
        public static void main(String[] args){
//            Pen pen1 = new Pen();
//            pen1.color ="blue";
//            pen1.type ="gel";
//            pen1.write();
//            Pen pen2 = new Pen();
//            pen2.color="pink";
//            pen2.type="ballpoint";
//            pen1.printcolor();
//            pen2.printcolor();
            student s1 =new student("ankit",21);
//            s1.name = "aman";
//            s1.age =24;
            s1.printInfo();
        }
}
