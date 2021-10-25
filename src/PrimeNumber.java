
public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=7;
		int i=2;
		
		while(i<n) {
			if(n%i==0) {
				System.out.println("No");
				return;
			}
			i++;
		}
		
		System.out.println("YES");

	}

}
