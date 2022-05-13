package April3rd;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int f = 0, s =1, sum;
		 
		System.out.println("Print fibonacci series till ");
		int n = sc.nextInt();
		System.out.print(f + " "+s);
	//	System.out.println(s);
		for (int i = 2; i < n; i++) {
			
			sum = f + s;
			System.out.print(" "+sum + " ");
			f = s;
			s = sum;
			
		}
}
}
