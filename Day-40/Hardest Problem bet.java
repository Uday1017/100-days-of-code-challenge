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
		    int S1 = sc.nextInt();
		    int S2 = sc.nextInt();
		    int S3 = sc.nextInt();
		    int min = 101;
		    if(S1<S2 && S1<S3){
		        System.out.println("Draw");
		    }else if(S2<S1 && S2<S3){
		        System.out.println("Bob");
		    }else if(S3 < S1 && S3 < S2){
		        System.out.println("Alice");
		    }
		
		}

	}
}
