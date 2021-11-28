package Functions;

public class FirstDigitOfANumber {

	public static void main(String[] args) {
		
		int n = 1234;
		
		System.out.println(printFirst(n));

	}
	
	public static int printFirst(int n) {
		
		while(n>10) {
			n=n/10;
			
		}
		return n;
	}

}
