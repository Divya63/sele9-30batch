package pkg2;

public class Dynamic_Ass19_2b extends Calculator {
	
	public void Method1(int a, int b) {
		int mul = a*b;
		System.out.println("Child Method1");
		System.out.println("Multiplication of two integers: "+ mul);
	}
	
	public void Method2(float a, int b) {
		float div = a/b;
		System.out.println("Child Method2");
		System.out.println("Division of integer and float value: "+ div);
	}
	public static void main(String[] args) {
		Calculator cc = new Calculator();
		cc.Method1(90, 80);
		cc.Method2(88f, 11);
		System.out.println("\n");
		Dynamic_Ass19_2b dd = new Dynamic_Ass19_2b();
		dd.Method1(66,10);
		dd.Method2(125.5f, 5);
		
		
		
	}

}
