public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<(2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>0; i--){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<(2*i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
