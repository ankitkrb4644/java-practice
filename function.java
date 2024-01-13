import java.util.Scanner;
public class function {
    // public static int calculateSum(int a , int b) {
    //     int sum = a + b;
    //     return sum;
    // }
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
        
    //     int sum = calculateSum(a,b);
    //     System.out.println("sum of 2 number is :" +sum);
    public static int calculateMulti(int a , int b) {
        int multi = a * b;
        return multi;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multi = calculateMulti(a,b);
        System.out.println("multiplication of 2 number is :" +multi);
    }
}
