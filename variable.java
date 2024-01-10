import java.util.Scanner;
public class variable {
    public static void main(String[] args) {
    // System.out.println("hii Ankit now we start dsa course ");
        // variable
          int a =19;
          int b =24;
          int sum=a+b;
          int diff = b-a;
          System.out.println(diff);
          System.out.println(sum);
          Scanner sc = new Scanner(System.in);
          String name = sc.nextLine();
          System.out.println(name);
        //second example
          Scanner sc1 = new Scanner(System.in);
          int a1 =sc1.nextInt();
          int b2 =sc1.nextInt();
          int sum3 = a1+b2;
          System.out.println(sum);
        //third example
        int button = 1; //assuming button is a integer variable
        switch(button) {
            case 1:System.out.println("Hello ankit");
            break;
            case 2:System.out.println("namste ankit");
            break;

        }
    }
}
