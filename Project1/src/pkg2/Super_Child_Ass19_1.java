package pkg2;

public class Super_Child_Ass19_1 extends Super_Parent_Ass19_1
{

	public void Default_C() {
		super.Two_P(23, 56);
		System.out.println("Child Default Method");
	}	
	public void One_C(char k) {
		System.out.println("Child One Parametrized Method");
	}	
	public void Two_C(float h, float t) {
		this.Default_C();
		this.Three_C(8, 9, 55);
		this.One_C('d');
		System.out.println("Child Two Parametrized Method");
	}	
	public void Three_C(int f, int j, int l) {
		System.out.println("Child Three Parametrized Method");
	}

	public static void main(String[] args) {
		Super_Child_Ass19_1 k = new Super_Child_Ass19_1();
		k.Two_C(7.6f, 5.4f);
	}
}
