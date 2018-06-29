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
	  String s;
	  int sum = 0,i;
	  s = sc.nextLine();
	  char [] a = s.toCharArray();
	  
	  
	  	if(Character.getNumericValue(a[0])%2!=0)
	  	{
	  	 for(i=0;i<a.length;i++)
	  	 {
	  	 	sum = sum+(Character.getNumericValue(a[i]));
	  	 	if(sum%2==0)
	  	 	{
	  	 	 
	  	 	  break;
	  	 	}
	  	 	
	  	 }
	  	 System.out.println(sum);
	  	}
	  	else
	  	{
	  	for(i=0;i<a.length;i++)
	  	 {
	  	 	sum = sum+Character.getNumericValue(a[i]);
	  	 	if(sum%2!=0)
	  	 	{
	  	 	  
	  	 	  break;
	  	 	}
	  	 	
	  	 }	
	  	 System.out.println(sum);
	  	}
	  
	  
	
	}
	   
	}
