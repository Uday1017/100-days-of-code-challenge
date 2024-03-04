public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            for(int k = 1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int k =i; k>=1; k--){
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }
}
