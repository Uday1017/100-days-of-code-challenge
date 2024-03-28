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
		int N = sc.nextInt();
		sc.nextLine();
		for(int t =0; t<N; t++){
		    String S = sc.nextLine();
		    String T = sc.nextLine();
		    StringBuilder M = new StringBuilder();
		    for(int i = 0; i<S.length(); i++){
		        if(S.charAt(i) == T.charAt(i)){
		            M.append("G");
		        }else{
		            M.append("B");
		        }
		    }
		    System.out.println(M);
		}
		

	}
}
