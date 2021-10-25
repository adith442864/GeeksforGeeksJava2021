
public class AutoBoxingAndUnboxing {
	
	// AutoBoxing and Unboxing related to Wrapper Classes:

	public static void main(String[] args) {
		 
		// Autoboxing:
		int x1=10;
		Integer x2=x1; //Auto boxing
		int x3=x2; // Auto unboxing ... Object type variable is assigned to primitive type varable which is working perfectly.
		
		System.out.println(x1); //10
		System.out.println(x2); // 10
		System.out.println(x3); // 10
		
		System.out.println("--------------------");
		
		Integer p1=400, p2=400;
		
		if(p1==p2) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
	

	}

}
