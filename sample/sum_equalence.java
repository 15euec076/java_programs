import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int i,sum=10;
		int n = scan.nextInt();
		int [] arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
		 for(int j=i+1;j<n;j++)
		 {
			 if((arr[i]+arr[j])==sum)
			 {
				 System.out.println("("+arr[i]+","+arr[j]+")");
			 }
		 }
	}
	}
}
