public class different_pattern_prob {
    public static void main(String[] args) {
        // question no 1
        int n=4;
        // // outer loop
        for(int i=n;i>=1;i--){
        for(int j=n;j<=n-1;j++){
        System.out.print("*");
    }
        // inner loop -> star print
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
        }
        // question no 2
        // int n1=4;
        // int m=5;
        // // outer loop
        // for(int i=1;i<=n1;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
    // }
    // question-03
    // int n=4;
    // int m=5;
    // // outer loop
    // for(int i=1;i<=n;i++){
    //     // inner loop
    //     for(int j=1;j<=m;j++){
    //         if( i==1 || j==1 || i==n || j==m){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println( );
    // }
}
}
    
    
