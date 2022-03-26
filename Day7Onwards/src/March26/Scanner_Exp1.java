package March26;

import java.util.Scanner;

//  Solving (((((x1+x2)-x3)+x4)*x5)/x6)

public class Scanner_Exp1 {
    public int sum(int a, int b) {
    	int s;
    	s = a+b;
		return s;    	
    }    
    public int diff(int c, int g) {
    	int d;
    	d = c-g;
		return d;    	
    }    
    public int mul(int h, int k) {
    	int m;
    	m = h*k;
		return m;    	
    }
    public int div(int i, int j) {
		int v;
		v=i/j;
    	return v;    	
    }
    public static void main(String[] args) {
    	Scanner_Exp1 e = new Scanner_Exp1();
		Scanner sc  = new  Scanner(System.in);
		System.out.println("value of x1 : ");
		int x1 = sc.nextInt();
		System.out.println("value of x2 : ");
		int x2 = sc.nextInt();
		int sumres = e.sum(x1, x2);
		System.out.println("sum res(x1+x2) :" + sumres);
		System.out.println("value of x3 : ");
		int x3 = sc.nextInt();
		int subr = e.diff( sumres, x3);
		System.out.println(" sub res((x1+x2)-x3) :" + subr);
		System.out.println("value of x4 : ");
		int x4 = sc.nextInt();
		int addr = e.sum(subr, x4);
		System.out.println("sum2 res(((x1+x2)-x3)+x4) :" + addr);
		System.out.println("value of x5 : ");
		int x5 = sc.nextInt();
		int mulr = e.mul(addr, x5);
		System.out.println("mul res((((x1+x2)-x3)+x4)*x5) :" + mulr);
		System.out.println("value of x6 : ");
		int x6 = sc.nextInt();
		int divr = e.div(mulr, x6);
		System.out.println("result of exp (((((x1+x2)-x3)+x4)*x5)/x6) : " + divr);
	}
}
