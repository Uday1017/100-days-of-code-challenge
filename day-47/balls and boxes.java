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
		for(int t=0; t<T; t++){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int balls = K*(K+1)/2;
		    if(N >= balls){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		}
		

	}
}
