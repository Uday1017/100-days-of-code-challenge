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
		    int[] D = new int[N];
		    int count = 0;
		    for(int i = 0; i<N; i++){
		        D[i] = sc.nextInt();
		        if(D[i] >= 1000){
		           count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
