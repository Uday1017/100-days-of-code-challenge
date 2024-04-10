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
		for(int t = 0; t<T; t++){
		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int[] arr = new int[N];
		    for(int i = 0; i<N; i++){
		        arr[i] = sc.nextInt();
		    }
		    int countA = 0;
		    int countB = 0;
		    for(int j = 0; j<N; j++){
		        if(arr[j] == A){
		            countA++;
		        }
		        if(arr[j] == B){
		            countB++;
		        }
		    }
		    double probA = (double) countA / N;
            double probB = (double) countB / N;
            double probability = probA * probB;
            System.out.println(probability);
		    
		}
		

	}
}
