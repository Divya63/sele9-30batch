package pkg1;

public class Practice_this {
	
	public Practice_this() {
		this(3, 4, 5, 6);
		System.out.println("Default Constructor");
	}

	public Practice_this(int a) {
		System.out.println("One Parametrized Constructor");
	}
	
	public Practice_this(int f, int g) {
		System.out.println("Two  Parametrized Constructor");
	}
	
	public Practice_this(int k, int l, int m) {
		this(7, 8);
		System.out.println("Three Parametrized Constructor");
	}
	
	public Practice_this(int o, int p, int q, int e) {
		System.out.println("Four Parametrized Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_this r = new Practice_this();
		Practice_this p = new Practice_this(34, 67,89);
		Practice_this h = new Practice_this(99);
		

	}

}
