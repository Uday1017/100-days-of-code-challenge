public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<2*n-(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
