package April10_Patterns;

public class Star_Pattern4 {
public static void main(String[] args) {
		
		System.out.println("**********Star Pattern 4(Pyramid)***********");
		int row = 5;
		for (int i = 1; i <= row; i++) {     // for rows
			
			for(int s = i;s<=row; s++ ) {      // for printing space
				System.out.print("   ");
			}
	/*		for (int j =1; j <i; j++) {     // for printing star(right triangle increasing)
				System.out.print("* ");
			}
			for(int k = 1; k<=i;k++) {               // for printing star(increasing triangle left)
				System.out.print("* ");
			}
			System.out.println();
		}  */
			for (int k=1; k<=2*i-1; k++) {						//for printing star
				System.out.print("* ");
			}
			System.out.println();
		}
}
}
