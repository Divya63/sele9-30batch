package April3rd;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int temp, q ,rem , sum=0;
		 
		System.out.println("Enter the number to check whether it is Palindrome");
		int num = sc.nextInt();
		temp = num;
		
		//loop to check number is Palindrome
		for (int i = 0; temp != 0; i++) {
			rem = temp %10;
			sum = sum*10 + rem;
			q = temp/10;
			temp = q;
		}
		if (sum == num) {
			System.out.println(num+" is a Palindrome");
		}else {
			System.out.println(num+" Not A Palindrome");
			
		}
}

}
