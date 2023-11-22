public class try_catch {
    public static void main(String[] args) {
        int a=6000;
        int b=9;
        try {
            int c = a / b;
            System.out.println("the result is "+c);
        }
        catch(Exception e) {
            System.out.println("we failed to divide.Reason:");
            System.out.println(e);
        }
        System.out.println("end of the group");
    }
}
