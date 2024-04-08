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
		    int[] A = new int[N];
		    for(int i = 0; i<N; i++){
		        A[i] = sc.nextInt();
		    }
		    int K = sc.nextInt();
		    int uncle_lenght = A[K-1];
		    Arrays.sort(A);
		    int indexnew = 0;
		    for(int j = 0; j<N; j++){
		        if(A[j] == uncle_lenght){
		            indexnew = j+1;
		        }
		    }
		    System.out.println(indexnew);
		    
		}
		

	}
}
