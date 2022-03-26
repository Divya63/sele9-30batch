package pkg2;

public class India_hie extends Hierarchical_Asia {

	public void child_Ind() {
		System.out.println("India is a sub-continent");
	} 
	
	public static void main(String[] args) {
		India_hie i = new India_hie();
		i.Parent_asia();
		i.child_Ind();
	}
}
