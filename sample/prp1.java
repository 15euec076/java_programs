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
		String s1="wipro";
		String s2="technologies";
		int i,j,temp;
	    int a = s.nextInt();
	    char[] c = s1.toCharArray();
	    char[] d = s2.toCharArray();
	    if(a==1)
	    {
	    	for(i=0;i<c.length;i++)
	    	{
	    		for(j=0;j<d.length||j<c.length;j++)
	    		{
	    			if(c[i]==d[j])
	    			{
	    				System.out.println(c[i]);
	    				c[i]+='A'-'a';
	    				d[j]+='A'-'a';
	    				
	    				
	    			}
	    		}
	    	}
	    }
	    
	    else if(a==0)
	    {
	    	for(i=0;i<c.length;i++)
	    	{
	    		for(j=0;j<d.length||j<c.length;j++)
	    		{
	    			if(c[i]!=d[j])
	    			{
	    			 c[i]+='A'-'a';
	    			 
	    			}

	    		}
	    	}
	    for(i=0;i<d.length;i++)
	       {
	    	for(j=0;j<c.length;j++)
	    		{
	    			if(d[i]!=c[j])
	    			{
	    			 d[i]+='A'-'a';
	    			 
	    			}

	    		}
	    	}
	    	
	    }
	else
	{
	System.out.println("no accepted value");
	}
	    
	    	System.out.print(c);
	    
	    
	    
	    	System.out.print(d);
	    
	}
}
