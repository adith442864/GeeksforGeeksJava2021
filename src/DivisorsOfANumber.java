
public class DivisorsOfANumber {

	public static void main(String[] args) {
		
		int n=12;
		int i=1;
		
		while(i<=12) {
			if(n%i==0)
				System.out.println(i+" ");
			i++;
		}

	}

}
