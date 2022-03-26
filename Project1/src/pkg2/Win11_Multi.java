package pkg2;

public class Win11_Multi extends Windows_Multi {

	public void child_11() {
		System.out.println("Windows 11 is latest version of Windows");
	} 
	
	public static void main(String[] args) {
		Win11_Multi w = new Win11_Multi();
		w.os_grand();
		w.win_parent();
		w.child_11();
	}
}
