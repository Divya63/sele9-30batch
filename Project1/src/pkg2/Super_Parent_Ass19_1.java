package pkg2;

public class Super_Parent_Ass19_1 {
	
	public void Default_P() {
		System.out.println("Parent Default Method");
	}	
	public void One_P(float e) {
		System.out.println("Parent One Parametrized Method");
	}	
	public void Two_P(int a, int b) {
		this.Three_P('f', 'g', 'r');
		this.Default_P();
		this.One_P(66f);
		System.out.println("Parent Two Parametrized  Method");
	}	
	public void Three_P(char d, char t, char u) {
		System.out.println("Parent Three Parametrized  Method");
	}
}
