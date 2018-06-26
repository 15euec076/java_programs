import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		String in;
		in = s.next();
		char [] c = in.toCharArray();
		int i,temp;
		for(i=0;i<c.length;i++)
		{
			if(c[i]>=65 && c[i]<=90)
			{
			 temp = (int) c[i];
			 temp = temp +32;
			 c[i] = (char) temp;
			}
			else
			{
				temp = (int) c[i];
			 temp = temp -32;
			 c[i] = (char) temp;
				
			}
		}
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		
	}
}
