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
		sc.nextLine();
		for(int t = 0; t<T; t++){
		    String s = sc.nextLine();
		    int count1 = 0;
		    int count2 = 0;
		    for(int i = 0; i<s.length(); i++){
		        if(s.charAt(i) == 'a'){
		            count1++;
		        }else{
		            count2++;
		        }
		    }
		    if(count1 < count2){
		        System.out.println(count1);
		    }else{
		        System.out.println(count2);
		    }
		}

	}
}
