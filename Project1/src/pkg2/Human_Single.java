package pkg2;

public class Human_Single extends Single_Level_God{
	
	public void display() {
		System.out.println("Human creation of GOd");
	} 

	public static void main(String[] args) {
		Human_Single hs = new Human_Single();
		
		hs.show();
		hs.display(); 
	}
}

/* if parent and child class has same method name then
 *  how to call parent method*/
 