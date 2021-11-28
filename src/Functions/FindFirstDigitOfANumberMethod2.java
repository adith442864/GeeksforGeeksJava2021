package Functions;

public class FindFirstDigitOfANumberMethod2 {

	public static void main(String[] args) {
		
		
		int n = 9768;
		
		System.out.println(FirstDigit(n));
		

	}
	
	public static int FirstDigit(int n) {
		
		double power = Math.log10(n);
		int p = (int)power;
		int a = (int) Math.pow(10, 3);
		int res = n/a;
		return res;
			
	}

}
