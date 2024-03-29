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
		    int L = sc.nextInt();
		    int X = sc.nextInt();
		    if(N-L>L){
		        System.out.println(L*X);
		    }else{
		        System.out.println((N-L)*X);
		    }
		}

	}
}
