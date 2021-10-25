
public class SquarePattern {

	public static void main(String[] args) {
		
		// logic:
			// no of rows: n=4
			// no of columns = n
			// what to be printed:  *
		
		int n=4;
		int i=1;
		
		while(i<=n) {
			int j=1;
			
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			
			i++;
			
			System.out.println();
		}

	}

}
