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
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int D = sc.nextInt();
		    if(X > Y){
		         if(X - Y <= D){
		            System.out.println("YES");
		    }    else{
		            System.out.println("NO");
		    }
		    }else{
		        if(Y - X <= D){
		            System.out.println("YES");
		    }    else{
		            System.out.println("NO");
		    }
		    }
		}

	}
}
