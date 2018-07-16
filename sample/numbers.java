/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			 Scanner s = new Scanner(System.in);
	  int[] a = new int[7];
	  int i,j;
	  for(i=0;i<7;i++)
	  {
	  	a[i] = s.nextInt();
	  	
	  }
	  int n = a.length;
	  Arrays.sort(a);
	 int [] temp = new int[7];
	 int k=0;
	 for(i=0,j=n-1;i<=n/2 || j>n/2;i++,j--)
	 {
	 	
	 	if(k<n)
	 	{
	 		temp[k]=a[j];
	 		k++;
	 	}
	 	if(k<n)
	 	{
	 		temp[k]=a[i];
	 		k++;
	 	}
	 }
	 for(i=0;i<n;i++)
	 {
	    a[i]=temp[i];
	 }
	 for(i=0;i<n;i++)
	 {
	   System.out.println(a[i]);
	 }
	 
	}
}
