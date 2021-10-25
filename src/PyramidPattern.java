
public class PyramidPattern {

	public static void main(String[] args) {
		// logic:
			// no of rows: n=4
			// no of columns = 
				// 2n-1 (To get the no of columns)
				// no of spaces = n-i
			// what to be printed:  *
		
		int i=1;
		int n=10;
		
		while(i<=n) {
			int j=1;
			while(j<=(n-i)) {
				System.out.print(" ");
				j++;
			}
			
			int k=1;
			while(k<=(2*i-1)) {
				System.out.print("*");
				k++;
			}
			
			i++;
			System.out.println();
			
		}
		

	}

}
