
package April2;

import java.util.Scanner;

public class SSS {
	
	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		int[] input = new int[10]; 
		int[] output = new int[10];
		// {​​6,0,8,2,3,0,4,0,1} ;
		System.out.println("Enter number of elements in array");
		int l = s.nextInt();
		System.out.println("Enter the elements in array" );
		 for (int j = 0; j<=l; j++) {
			
		input[j] = s.nextInt();
		 }
		for(int i = 0; i<=l;i++)
			{
				if(input[i]==0) {
					output[l] =0;
					
				}
				System.out.println(output[l]);
			}  
		
	
	}
}


}
