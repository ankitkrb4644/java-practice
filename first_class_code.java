class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class first_class_code {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Ankit = new Employee();//instantiating a new Employee object
        //setting Attributes
        Ankit.id=07;
        Ankit.salary=34;
        Ankit.name ="Ankit_Barnwal";
        //printing the Attributes
//        System.out.println(Ankit.id);
//        System.out.println(Ankit.name);
        Ankit.printDetails();
        int salary = Ankit.getSalary();
        System.out.println(salary);
    }
}
