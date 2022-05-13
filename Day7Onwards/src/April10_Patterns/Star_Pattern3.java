package April10_Patterns;

public class Star_Pattern3 {
public static void main(String[] args) {
		
		System.out.println("**********Star Pattern 3(Increasing triangle right(1-2-3-4-5))***********");
		int row = 5;
		for (int i = 1; i <= row; i++) {     // for rows
			
			for(int s = i;s<=row; s++ ) {      // for printing space
				System.out.print("   ");
			}
			for (int j =1; j <= i; j++) {     // for printing star
				System.out.print("* ");
			
							}
			System.out.println();
		}
	}

}
