package info;
import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int rem,rev=0;
		int temp = num;
		while(num>0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
				
		
	}

}
