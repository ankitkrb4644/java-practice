class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x=x;
    }
    public void printMe(){
        System.out.println("i am constructor");
    }
}
class derived extends base{     //this derived base class acquires all the properties and behaviors of parent object.
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
    this.y=y;
    }
}
public class inheritance {
    public static void main(String [] args){
        // Creating an object of base class
        base s = new base();
        s.setX(4);
        System.out.println(s.getX());
        //Creating an object of derived class
        derived d= new derived();
        d.setX(43);
        System.out.println(d.getX());
    }
}
