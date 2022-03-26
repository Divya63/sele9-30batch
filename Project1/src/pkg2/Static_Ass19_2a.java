package pkg2;
//Method Overloading example
public class Static_Ass19_2a {
	public void diff(int a,  int h) {
		int d = a-h;
		System.out.println("Differene of two integer values: "+d);
	}
	public void diff(int g,  float j) {
		float k = j-g;
		System.out.println("Differene of integer and float value: "+k);
	}	
	public void diff(float y, int r) {
		int o = (int) (r-y);
		System.out.println("Differene of integer and float value: "+o);
	}
	public void diff(float l,  float p) {
		float u = p-l;
		System.out.println("Differene of two float values: "+u);
	}	
	public static void main(String[] args) {
		Static_Ass19_2a s = new Static_Ass19_2a();
		System.out.println("Method Overloading/Static Polymorphism Example\n");
		s.diff(45.0f, 55.5f);
		s.diff(65, 87);
		s.diff(4, 2);
	}
}
