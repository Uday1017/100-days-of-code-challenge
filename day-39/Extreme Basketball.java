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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if(A-B>10){
		        System.out.println(0);
		    }else{
		        int shotsneeded = (int) Math.ceil((double) (10 - (A - B)) / 3);
		        System.out.println(shotsneeded);
		    }
		}
		

	}
}
