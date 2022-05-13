package march27;

public class Final_Class extends Class2{
	
	//final float f = 23.5f;
	float f = 23.5f;
	
	public void disp1() {
		System.out.println("Display method1");
	}
	
	public void disp2() {
		System.out.println("override final  method2");
	}
	public static void main(String[] args) {
		Final_Class fc = new Final_Class();
		fc.disp1();
		fc.disp2();
		fc.f = 9.8f;
		System.out.println("value of final variable : " + fc.f);
        
	}

}
