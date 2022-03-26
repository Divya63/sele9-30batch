package pkg1;

public class Assignment6_2a {
	
	public void display() {
		System.out.println("method calling ");
	}
	public static void main(String[] args) {
		System.out.println("method calling by object of same class");
		
		Assignment6_2a n = new Assignment6_2a();
		n.display();
		
	}

}
