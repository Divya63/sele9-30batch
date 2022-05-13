package April10_Patterns;

public class Star_Pattern1 {
	public static void main(String[] args) {
		
		System.out.println("**********Star Pattern 1(Increasing triangle left(1-2-3-4-5))***********");
		int row = 5;
		for (int i = 1; i <= row; i++) {     // for rows
			
			for (int j =1; j <= i; j++) {     // for printing star
				System.out.print("* ");
								
			}
			System.out.println();
		}
	}

}
