
public class NthTermOfArithmeticProgression {

	public static void main(String[] args) {
		
		// formula: a+(n-1)*d
		
		// 1 2 3 4 5 6 7 8 9 10 
		// a+n-1*d = 1+(4*2) = 9
		// 5+(9*2) = 23
		
		int a=5, d=2;
		int n=10;
		
		int ans = a+((n-1)*d);
		
		System.out.println(ans);

	}

}

// 9606028119 -> Home care services: