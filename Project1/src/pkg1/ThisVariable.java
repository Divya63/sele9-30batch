package pkg1;

public class ThisVariable {
	 int var = 88;
	
	public void variabledemo() {
		int var = 99;
		var = var;  //same name of variable
		System.out.println("value of  G " + var);
		this.var = var;  // assigning local value to global variable using this keyword
		
	}
	public static void main(String[] args) {
		ThisVariable j =new ThisVariable();
		j.variabledemo();
		System.out.println("value of  G " + j.var);  //global value will be printed
		//System.out.println("value of  G "+ var);
		
		
	}

}
