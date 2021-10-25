package BitwiseOperator;

public class BitwiseLeftShiftOperator {

	public static void main(String[] args) {
		
		 int x = 3;
		 
		 // x: 000....0011
		    
	    System.out.println(x << 1); //6
	    
	    // x: 00....0110 // 6
	    
	    System.out.println(x << 2);
	    
	    // x: 00000000000000000000000000000011
	    // x: 00000000000000000000000000001100 //12
	    
	    int y = 4;
	    
	    int z = (x << y);
	    // x: 00000000000000000000000000000011
	    // x: 00000000000000000000000000110000 //48
	    
	    
	    System.out.println(z);
	    
	    int a = -1;
	    System.out.println(a<<1);
		
	    // a: 11111111111111111111111111111111
	    // a: 11111111111111111111111111111110 //-2
		

	}

}
