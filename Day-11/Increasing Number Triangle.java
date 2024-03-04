public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }    
    }
}
