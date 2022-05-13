package April3rd;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int temp, count=0, q ,rem , sum=0;
		 
		System.out.println("Enter the number to check whether it is Armstong num ");
		int num = sc.nextInt();
		temp = num;
		//to count number of digit of number
		while(temp !=0) {
			temp = temp/10;
			count++;    
		}
		temp = num;
		//to check number is Armstrong
		for (int i = 0; temp != 0; i++) {
			rem = temp %10;
			sum = (int) (sum + Math.pow(rem, count));
			q = temp/10;
			temp = q;
		}
		if (sum == num) {
			System.out.println(num+" is a Armstrong Number");
		}else {
			System.out.println(num+" Not A Armstrong Number");
			
		}
}

}
