package info;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		int rem;
		int n;
		
		while(num!=0)
		{
		  rem = num%10;
		  sum = sum + rem;
		  num = num/10;
		}
		
		System.out.println(sum);
	}

}
