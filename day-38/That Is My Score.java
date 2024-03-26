import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int[] maxScores = new int[12]; 
            for (int i = 0; i < N; i++) {
                int p = sc.nextInt(); 
                int s = sc.nextInt(); 
                maxScores[p] = Math.max(maxScores[p], s); 
            }
            int totalScore = 0;
            for (int i = 1; i <= 8; i++) { 
                totalScore += maxScores[i]; 
            }
            System.out.println(totalScore); 
        }
    }
}
