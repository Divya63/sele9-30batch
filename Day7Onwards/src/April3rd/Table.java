package April3rd;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter the number to print a table");
		int num = s.nextInt();
		int table;
		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(num +" * "+ i +" = "+ table);
		}
	}
	

}
