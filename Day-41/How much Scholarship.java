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
		int R = sc.nextInt();
		if(R <= 50){
		    System.out.println(100);
		}else if(R>50 && R<101){
		    System.out.println(50);
		}else{
		    System.out.println(0);
		}
		

	}
}
