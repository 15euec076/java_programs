/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	  int l,h,n,i,temp,j;
	  
	  l = sc.nextInt();
	  h = sc.nextInt();
	  n = sc.nextInt();
	  int [] a = new int[h];
	  
	  for(i=0;i<n;i++)
	  {
	  	a[i] = sc.nextInt();
	  	
	  }
	  for(i=0;i<n;i++)
	  {
	  for(j=i+1;j<n;j++)
	  {
	  	if(a[i]>a[j])
	  	{
	  		temp=a[i];
	  		a[i]=a[j];
	  		a[j]=temp;
	  	}
	  	
	  }
	  }
	  for(i=0;i<n;i++)
	  {
	  	if(a[i]<20 || a[i]>30)
	  	System.out.println(a[i]);
	  }
	  
	}
	   
	}
