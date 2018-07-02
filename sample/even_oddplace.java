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
       int i;
       s = sc.nextLine();
       
       String[] g = s.split(" ");
      
       for(String a:g)
       {
       	 char[] a1 = a.toCharArray();
       for(i=0;i<a1.length;i=i+2)
       {
         System.out.print(a1[i]);
       }
       for(i=1;i<a1.length;i=i+2)
       {
       	System.out.print(a1[i]);
	}
       }
	}
}
