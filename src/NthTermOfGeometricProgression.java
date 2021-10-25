
public class NthTermOfGeometricProgression {

	public static void main(String[] args) {
		
		// formula: a*(r^n-1) : 2*(3^3) =54 
		int a=2, r=3, n=4;
		
		int ans= a*(int)(Math.pow(r, n-1));
		
		System.out.println(ans);
		
		
	}

}
