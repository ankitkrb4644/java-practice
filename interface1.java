interface Animal{
    int eyes =2;
    void walk();
}
interface Herbivore{

}
class Horse implements Animal,Herbivore{   //multi level inheritance
    public void walk(){   // you have to make it as a public
        System.out.println("walks on 4 legs");
    }
}
public class interface1 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
