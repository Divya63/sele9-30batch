package pkg1;

public class Assignment6_1 {
	
	public Assignment6_1() {
		this(3, 4, 5, 6);
		System.out.println("Default Constructor");
	}
	public Assignment6_1(int a) {
		this(4, 8, 9);
		System.out.println("One Parametrized Constructor");
	}	
	public Assignment6_1(int f, int g) {
		this();
		System.out.println("Two  Parametrized Constructor");
	}	
	public Assignment6_1(int k, int l, int m) {
		this(7, 8);
		System.out.println("Three Parametrized Constructor");
	}
	
	public Assignment6_1(int o, int p, int q, int e) {
		
		System.out.println("Four Parametrized Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This keyword example--->");
		Assignment6_1 h = new Assignment6_1(99);
		

	}

}
