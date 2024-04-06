import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int gcd = gcd(X, Y);
            System.out.println(gcd);
        }
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
