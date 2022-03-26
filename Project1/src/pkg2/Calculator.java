package pkg2;

public class Calculator {

	public void Method1(int a, int b) {
		int s = a+b;
		System.out.println("Parent Method1");
		System.out.println("Addition of two integer:"+s);
	}
	
	public void Method2(float a, int b) {
		float sub = a-b;
		System.out.println("Parent Method1");
		System.out.println("Subtraction of integer and float value: "+ sub);
	}
	
	
}
