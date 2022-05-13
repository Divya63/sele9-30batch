package April10_Patterns;

public class Number_Pattern1 {
	
public static void main(String[] args) {
				int   row = 4, k=1;
				for (int  i = 1;  i<= row ; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(k +" ");
						k++;
					}
					System.out.println();
				}
	
}
}
