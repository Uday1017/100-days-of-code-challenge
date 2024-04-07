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
		    int D = sc.nextInt();
		    String s = sc.next();
		    boolean possible = false;
		    for(int i = 0; i<s.length(); i++){
		        if(s.charAt(i) == '0' || s.charAt(i) == '5'){
		           possible = true;
		           break;
		        }
		    }
		    if(possible == true){
		            System.out.println("Yes");
		        }else{
		            System.out.println("No");
		        }
		}


	}
}
