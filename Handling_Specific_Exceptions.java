import java.util.Scanner;
public class Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int [] marks =  new int[5];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind = sc.nextInt();
        System.out.println("enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("the value at array index entered is :"+marks[ind]);
            System.out.println("the value of array-value/number is:"+marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Some ArithmeticException occured!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some ArrayIndexOutOfBoundsException occured");
        }
        catch(Exception e){
            System.out.println("Some exception occured");
        }
    }
}
