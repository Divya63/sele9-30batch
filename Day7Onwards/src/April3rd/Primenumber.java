package April3rd;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n, f=0;
	System.out.println("Enter number to check whether it is prime or not" );
	n = sc.nextInt();
	
	if(n==0 || n==1) {
		System.out.println(n+" is not prime");
	}
	for (int i = 2; i <= n/2; i++) {
		if (n%i == 0) {
			System.out.println(n +" not prime number");
			f=1;
			break;
		} 
		
	}
	if (f==0) {
		System.out.println(n +" is a prime number");
		
	}
	
	}

}
