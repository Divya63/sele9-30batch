package pkg1;

public class Parent13 {
	
	public Parent13() {
		System.out.println("Parent Default Constructor");
	}
	public Parent13(int a) {
		this('g', 'm', 'b'); 
		System.out.println("Parent One Parametrized Constructor");
	}
	
	public Parent13(float f, float g) {
		this();
		System.out.println("Parent Two Parametrized Constructor");
	}
		
	public Parent13(char s, char t, char r) {
		this(55f, 88f);
		System.out.println("Parent Three Parametrized Constructor");
	}
}
