package info;
import java.io.*;

import java.lang.math;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		int res;
		res = (int)Math.pow(n,p);
		System.out.println(res);
		

	}

}
