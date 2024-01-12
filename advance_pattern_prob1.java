public class advance_pattern_prob1{
    public static void main(String[] args) {
        // // butterfly pattern
        // int n=5;
        // //upper half part of butter fly
        // for(int i=1;i<=n;i++){
        //     // first half
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        // // spaces
        // int spaces=2*(n-i);
        // for(int j=1;j<=spaces;j++){
        //     System.out.print(" ");
        // }
        // // 2nd half part of butterfly
        //     for(int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        
        // }
        // // lower half
        // for(int i=n;i>=1;i--){
        //     // first half
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        // // spaces
        // int spaces=2*(n-i);
        // for(int j=1;j<=spaces;j++){
        //     System.out.print(" ");
        // }
        // // 2nd half part of butterfly
        //     for(int j=1;j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        
        // }
        int n=5;
        for (int i=1;i<=n;i++){
            // space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=5;j++){
        System.out.print("*");
        }
        System.out.println();
    }
    }
}