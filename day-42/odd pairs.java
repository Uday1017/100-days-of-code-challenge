import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            long num = 0;
            if (N % 2 == 0) {
                num = (N / 2) * (N / 2);
            } else {
                num = ((N + 1) / 2) * ((N - 1) / 2);
            }
            System.out.println(num*2);
        }
    }
}
