import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
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
		    Arrays.sort(A);
		    int count = 1;
		    int maxcount = 1;
		    for(int j = 1; j<N; j++){
		        if(A[j] == A[j-1]){
		            count++;
		            if(count > maxcount){
		                maxcount = count;
		            }
		        }else{
		            count = 1;
		        }
		    }
		    System.out.println(N - maxcount);
		    
		    
		}

	}
}
