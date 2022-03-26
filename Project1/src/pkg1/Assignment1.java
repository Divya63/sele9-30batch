package pkg1;

public class Assignment1 {
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
	public int mul(int y, int u) {
		int m;
		m=y*u;
		System.out.println("multiply result = "+m);
		return m;
	}	
	public void divide(int k, int l) {
		int d;
		d=k/l;
		System.out.println("final result = "+d);
	}
	public static void main(String[] args) {
		Assignment1 f =new Assignment1();
		int add1 = f.add(10, 2);
		int add2 = f.add(add1, 2);
		int sub1 = f.sub(add2, 2);
		int mul1 = f.mul(sub1, 2);
		System.out.println("Solving expression (((((10+2)+2)-2)*2)/2)");
		f.divide(mul1, 2);
		
		

	}

}
