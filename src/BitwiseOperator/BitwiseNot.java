package BitwiseOperator;

public class BitwiseNot {

	public static void main(String[] args) {
		
		int x =1;
		System.out.println(~x);
		
		// x:  0000......0001
		// ~x: 1111......1110
		//----------------------
		// Representation : of -x = 2^32-x 
		
		int y=5;
		System.out.println(~y);
		// y:  0000......0101
		// ~y: 1111......1010
		//----------------------
		// Representation : of -x = 2^32-6 = -6 
		

	}

}
