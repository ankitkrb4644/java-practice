public class method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo (int a){
        System.out.println("Good morning " + a + " bro!");
    }
//    static void change(int a){
//        a=98;
//    }
//    static void change2(int [] arr){
//        arr[0]=98;
//    }
//    static void tellJoke(){
//        System.out.println("I invested a new word!\n" + "Plagraism!");
//    }
//
//         tellJoke();
//        case 1: Changing the integer
//                int x=45;
//        change(x);
//        System.out.println("the value of x after running change is:" + x);
//        case 1: changing the array
//        int [] marks={52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("The value of x after running change is:" + marks);
public static void main(String[] args){
    foo();
    foo(30);
    }

}
