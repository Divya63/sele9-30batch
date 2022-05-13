package April10_Patterns;

public class Star_Pattern2 {
public static void main(String[] args) {
		
		System.out.println("**********Star Pattern 2(Decreasing triangle(5-4-3-2-1_))***********");
		int row = 5;
		for (int i = 1; i <= row; i++) {     // for rows
			
			for (int j =i; j <= row; j++) {     // for printing star
				System.out.print("* ");
							}
			/* for (int j =row; j >=i; j--) {     // for printing star
				System.out.print("* ");
							}*/
			
			System.out.println();
		}
	}

}
