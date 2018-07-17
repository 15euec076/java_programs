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
		ArrayList<Integer> n = new ArrayList<Integer>();
		int n1,n2,n3,i,j;
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
	    
	           	n.add(n1);
	    	n.add(n2);
	    	n.add(n3);
	    	System.out.println(n);
	    	int []hun=new int[3];
	    	int []one=new int[3];
	    	int []ten=new int[3];
	    	
	   for(i=0;i<3;i++)
	   {
	         
	         hun[i]=n.get(i)/100;
	         ten[i]=(n.get(i)%100)/10;
	         one[i]=n.get(i)%10;
	         
	   }
	   int max=0;
	   for(i=0;i<3;i++)
	   {
	   	int num=n.get(i);
	     while(num>0)
	     {     
	     	if(num%10>max)
	     	{
	     		max=num%10;
	     	}
	     	num=num/10;
	     }
	   }
	  
	   
	   int min=hun[0];
	   for(j=0;j<hun.length;j++)
	   {
	    if(hun[j]<min)
	    {
	    	min=hun[j];
	    }
	   }
	 
	   int min1=ten[0];
	   for(j=0;j<ten.length;j++)
	   {
	    if(ten[j]<min1)
	    {
	    	min1=ten[j];
	    }
	   }
	   
	   int min2=one[0];
	   for(j=0;j<one.length;j++)
	   {
	    if(one[j]<min2)
	    {
	    	min2=one[j];
	    }
	   }
	   System.out.println(max+""+min+""+min1+""+min2);
	   }
    }
	        	
	       
	        
	      
		
		 
		
	
