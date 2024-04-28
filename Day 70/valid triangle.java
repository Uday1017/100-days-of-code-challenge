import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            if (A + B + C == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
