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
		    int[] counts = new int[100001];
		    for(int i = 0; i<N; i++){
		        int dolltype = sc.nextInt();
		        counts[dolltype]++;
		    }
		    for(int j = 0; j<counts.length; j++){
		        if(counts[j] % 2 != 0){
		            System.out.println(j);
		        }
		    }
		    
		    
		}
		
		

	}
}
