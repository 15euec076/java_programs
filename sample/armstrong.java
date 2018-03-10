package info;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int rem,sum=0;
	int temp = num;
	
	
	
	while(num>0)
	{
		rem = num%10;
		sum = sum + (rem*rem*rem);
		num = num/10;
		
	}
	 if (sum==temp)
	 {
		 System.out.println("yes"); 
	 }
	 else
	 {
		 System.out.println("no");
	 }
	}

}
