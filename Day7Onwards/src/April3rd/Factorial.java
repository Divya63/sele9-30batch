package April3rd;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to compute factorial");
		int num = s.nextInt();
		int res = 1;
		
		for (int i = 1; i <=num ; i++) {
			res = res  * i;
		}
		System.out.println("Factorial of number "+ res);
	}
}
