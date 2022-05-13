package April2;

public class Static_Use {
		  
	static int g;
	int d;
	public void inc_method() {
		d=d+1;
		System.out.println("after increment "+d);
	}
	
	public static void incr() {
		System.out.println("Static method");
		g=g+1;
		System.out.println("after increment "+g);
	}
	
	public static void main(String[] args) {
		
		// ******* Static Calling **********
		System.out.println("Initial Value " +Static_Use.g);
				Static_Use.incr();
				Static_Use.incr();
				Static_Use.incr();
				
				
				
				
				
				
				
				
	/*	************ non-static calling*********	
		System.out.println("###########Object 1########");
		Static_Use  su = new Static_Use();
		System.out.println("Before increment" + su.d);
		su.inc_method();
		System.out.println("\n");
		System.out.println("###########Object 2########");
		Static_Use  ss = new Static_Use();
		System.out.println("Before increment" + ss.d);
		ss.inc_method();
		System.out.println("\n");
		System.out.println("###########Object 2########");
		Static_Use  s = new Static_Use();
		System.out.println("Before increment" + s.d);
		s.inc_method();
		
		*/
		
		
		
		
	}
	}

