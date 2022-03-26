package pkg1;

public class Assignment6_2b {

	/*public void display() {
		System.out.println("method calling by object of same class");
	}*/
	
	public static void main(String[] args) {
		Assignment6_2a n = new Assignment6_2a();
		
		System.out.println("calling method of different class by making object -->");
		
		n.display();
}
}
