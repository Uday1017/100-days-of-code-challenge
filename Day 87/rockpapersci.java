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
		    sc.nextLine(); 
		    String A = sc.nextLine();
		    int win = 0;
		    for(int i = 1; i<A.length(); i++){
		        if(A.charAt(i) == A.charAt(i-1)){
		            win += 1;
		            i++;
		        }
		    }
		    int ans = N - win;
		    System.out.println(ans);
		}

	}
}
