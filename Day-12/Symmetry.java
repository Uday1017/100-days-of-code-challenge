public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
              System.out.print("* ");
     }
        for (int k = 1; k <= (2 * n) - (2 * i); k++) {
              System.out.print(" ");
     }
        for (int l = 1; l <= i; l++) {
            System.out.print("* ");
     }
           System.out.println();
  }

        for (int i = n - 1; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
      }
        for (int k = 1; k <= (2 * n) - (2 * i); k++) {
             System.out.print(" ");
      }
        for (int l = 1; l <= i; l++) {
            System.out.print("* ");
      }
           System.out.println();
   }

     }
  }
