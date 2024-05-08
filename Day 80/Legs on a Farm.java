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
		  //  if(N < 4){
		  //      System.out.println("1");
		  //  }
		    if(N%4 == 0){
		        System.out.println(N/4);
		    }else{
		        System.out.println(((N-2)/4) + 1);
		    }
		}
		

	}
}
