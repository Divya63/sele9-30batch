package pkg2;

public class Pak_Hier extends Hierarchical_Asia {

	public void child_Pak() {
		System.out.println("Pakistan is a sub-continent");
	}
	
	public static void main(String[] args) {
		Pak_Hier k = new Pak_Hier();
		
		k.Parent_asia();
		k.child_Pak();
		
	}
}
