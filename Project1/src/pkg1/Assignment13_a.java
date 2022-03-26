package pkg1;

public class Assignment13_a extends Parent13{
	
	public Assignment13_a() {
		this(33, 55);
		System.out.println("Child Default Constructor");
	}
	public Assignment13_a(float a) {
		
		this('y', 'u', 'd');
		System.out.println("Child One Parametrized Constructor");
	}
	
	public Assignment13_a(int f, int g) {
		this(44f);
		System.out.println("Child Two Parametrized Constructor");
	}
	public Assignment13_a(char s, char t, char r) {
		super(55) ;
		System.out.println("Child Three Parametrized Constructor");
	}	
	public static void main(String[] args) {
		Assignment13_a g = new Assignment13_a();
	}
}
