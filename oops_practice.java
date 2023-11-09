class employee{
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
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class oops_practice {
    public static void main (String[] args ){
    /*    problem2
    employee1 ankit = new employee1();
    ankit.setName("APB");
    ankit.salary=700;
    System.out.println(ankit.getSalary());
    System.out.println(ankit.getName());
    //problem 2
        Cellphone real = new Cellphone();
        real.callFriend();
        real.vibrating();
        real.ring();*/
        square sq = new square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
