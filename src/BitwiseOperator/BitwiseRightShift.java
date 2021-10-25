package BitwiseOperator;

public class BitwiseRightShift {

	public static void main(String[] args) {
		
		int x=33;
		System.out.println(x>>1);
		
		// x: 00......100001
		// x: 00......010000 //16
		
		System.out.println(x>>2);
		
		// x: 00......100001 ->last two digits will be ignored and have 2 new 0's in the beginning
		// x: 00......001000 // 8
		
		// negative number:
		
		x=-2;
		System.out.println(x>>1);
		
	}

}
