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
		    int S = sc.nextInt();
		    if(S == 0){
		        System.out.println(-1);
		    }else{
		        System.out.println((S+1)*(-1));
		    }
		}

	}
}
