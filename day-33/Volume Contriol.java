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
		int volume = 0;
		for(int t = 0 ; t<T; t++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if(X > Y){
		        volume = X - Y;
		    }else{
		        volume = Y - X;
		    }
		    System.out.println(volume);

		}
		

	}
}
