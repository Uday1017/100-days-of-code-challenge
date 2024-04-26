import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int runs = 0;
            for (int j = 0; j < N; j++) {
                runs += arr[j];
                double strikeRate = (double) runs / (j + 1) * 100;
                if (strikeRate == 100) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
