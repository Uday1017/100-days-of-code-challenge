import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int countEligible = 0;

            for (int i = 0; i < N; i++) {
                int age = sc.nextInt();
                if (age >= 10 && age <= 60) {
                    countEligible++;
                }
            }

            System.out.println(countEligible);
        }
    }
}
