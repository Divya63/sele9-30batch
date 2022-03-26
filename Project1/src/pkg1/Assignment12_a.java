package pkg1;

public class Assignment12_a {
	
	public void method1() {
		System.out.println("Default Method");
	}
	
	public void method2(int a) {
		this.method4(88, 77, 876);
		this.method1();
		System.out.println("One Parametrized Method");
		this.method5(88, 8, 67,45);
		this.method3(23, 65);
	}
	
	public void method3(int c, int d) {
		System.out.println("Two Parametrized Method");
	}
	
	public void method4(int s, int t, int q) {
		System.out.println("Three Parametrized Method");
	}
	
	public void method5(int r,int k, int m, int h) {
		System.out.println("Four Parametrized Method");
	}

	public static void main(String[] args) {
		
		Assignment12_a ref = new Assignment12_a();
		ref.method2(67);
	}
}
