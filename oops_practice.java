class employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
}
class Cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("vibrating.....");
    }
    public void callFriend(){
        System.out.println("calling Anki......t");
    }
}
public class oops_practice {
    public static void main (String[] args ){
    employee1 ankit = new employee1();
    ankit.setName("APB");
    ankit.salary=700;
    System.out.println(ankit.getSalary());
    System.out.println(ankit.getName());
    //problem 2
        Cellphone real = new Cellphone();
        real.callFriend();
        real.vibrating();
        real.ring();
    }
}
