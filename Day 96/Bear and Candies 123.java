import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int turn = 1;
            while (true) {
                if (turn % 2 != 0) {
                    if (A < turn) {
                        System.out.println("Bob");
                        break;
                    } else {
                        A -= turn;
                    }
                } else {
                    if (B < turn) {
                        System.out.println("Limak");
                        break;
                    } else {
                        B -= turn;
                    }
                }
                turn++;
            }
        }
        
        sc.close();
    }
}
