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
public class oops_practice {
    public static void main (String[] agrs ){
    employee ankit = new employee();
    ankit.setName("barnwal");
    ankit.salary=700;
    System.out.println(ankit.getSalary());
    System.out.println( ankit.getName());
    }
}
