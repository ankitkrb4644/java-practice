public class advance_pattern_prob1{
    public static void main(String[] args) {
        // butterfly pattern
        int n=5;
        //upper half part of butter fly
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int spaces=2*(n-1);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        // 2nd half part of butterfly
    }
}