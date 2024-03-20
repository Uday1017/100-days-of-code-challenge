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
		    int sum = 0;
		    if(N % 2 == 0){
		        sum = 13*(N/2);
		    }else{
		        sum = (13)*(N/2) + 6;
		    }
		    System.out.println(sum);
		}

	}
}
