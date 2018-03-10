package info;
import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rem,res=0;
		for(int i=1;i<1000;i++)
		{ int temp = i;
		  res = 0;
			while(temp!=0)
			{
				rem = temp%10;
				res = res + (rem*rem*rem);
				temp = temp/10;
			}
			if(i==res)
			{
				System.out.println(i);
			}
		}

	}

}
