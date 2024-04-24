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
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int[] arr = new int[N];
		    for(int i = 0; i<N; i++){
		        arr[i] = sc.nextInt();
		    }
		    int sum = 0;
		    for(int j = 0; j<N; j++){
		        if(X * arr[j] > Y){
		            sum += Y;
		        }else{
		            sum += X*arr[j];
		        }
		    }
		    System.out.println(sum);
		}

	}
}
