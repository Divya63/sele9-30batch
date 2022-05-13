package April3rd;

import java.util.Scanner;

public class Swap_Using3rdvar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first,second,t;
		System.out.println("Enter first number" );
		first = sc.nextInt();
		System.out.println("Enter second number" );
		second = sc.nextInt();
		System.out.println("*****************");

		t = first;
		first = second;
		second = t;
		
		System.out.println("After Swapping" );
		System.out.println("*****************");
		System.out.println("First number " + first);
		System.out.println("Second number " + second );
		
}
}
