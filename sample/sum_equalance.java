package packet;
import java.util.Scanner;
import java.io.*;
public class Sum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
		int i,sum=10,count=0;
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
				 System.out.println(arr[i]+","+arr[j]);
				 count++;
			 }
			 else
			 {
				 count=0;
			 }
				 
		 }
		}
		 if(count==0)
		 {
			 System.out.println("-1");
		 }
		
		

	}

}
