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
	    int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
		int count = 0;
		for(int i = 0; i<N; i++){
		    if(A[i] == X){
		        count++;
		    }
		}
		if(count != 0){
		    System.out.print("YES");
		}else{
		    System.out.print("NO");
		}
	}
}
