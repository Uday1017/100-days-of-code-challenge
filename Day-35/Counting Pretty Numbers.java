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
		    int count = 0;
		    int L = sc.nextInt();
		    int R = sc.nextInt();
		    for(int i = L; i<=R; i++){
		        if(i == 2 || i == 3 || i == 9 || i%10 == 2 || i%10 == 3 || i%10 == 9){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
