package pkg1;

public class Assignment2 {
	public int add(int a, int b) {
		int c;
		c=a+b;
		System.out.println("addition result = "+c);
		return c;
	}	
	public int sub(int v, int n) {
		int t;
		t=v-n;
		System.out.println("subtraction result = "+t);
		return t;
	}	
	public void mul(int y, int u) {
		int m;
		m=y*u;
		System.out.println("Final result = "+m);
	}
	public int divide(int k, int l) {
		int d;
		d=k/l;
		System.out.println("Divide result = "+d);
		return d;
	}
	public static void main(String[] args) {
	
		Assignment2 ref =new Assignment2();
		int div1 = ref.divide(10, 2);
		int sub1 = ref.sub(div1, 2);
		int add1 = ref.add(sub1, 2);
		int sub2 = ref.sub(add1, 2);
		System.out.println("Solving expression (((((10/2)-2)+2)-2)*2)");
		ref.mul(sub2, 2);
	}
}
