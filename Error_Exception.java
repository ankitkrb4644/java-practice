import java.util.Scanner;
public class Error_Exception {
    public static void main(String[] args) {
        int a=5;
        int b=9;
//       int b=0 //Error:no semicolon!
//         b=9; //Error: b not declared!
//        System.out.println(a+b); //it will give syntax error
        System.out.println(a);
        //LOGICAL ERROR
        //write a program to print all prime number between 1 and 10
        System.out.println(2);
        for (int i=1; i<5;i++){
            System.out.println(2*i+1);
        }
            // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("integer part of 1000 divided by k is"+1000/k);
    }
}
