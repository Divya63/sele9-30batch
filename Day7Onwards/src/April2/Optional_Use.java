package April2;

public class Optional_Use {
	
	public void optional(Object... abc) {
		if(abc.length == 0) {
		System.out.println("Default method");
	}else {
		System.out.println("Parametrized");
	}
		
	}
	
	public static void main(String[] args) {
		
		Optional_Use o = new Optional_Use();
		o.optional();
		o.optional(89, "hi", "pop");
		o.optional("ffwf", "fdbioh", "dfkh");
		
	}  

}
