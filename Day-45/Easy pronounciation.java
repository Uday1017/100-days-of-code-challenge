import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            String S = sc.next(); 
            int count = 0;
            boolean isHardToPronounce = false;
            for (int i = 0; i < S.length(); i++) {
                char currentChar = S.charAt(i);
                if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u') {
                    count++;
                    if (count >= 4) {
                        isHardToPronounce = true;
                        break;
                    }
                } else {
                    count = 0; 
                }
            }
            if (isHardToPronounce) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
