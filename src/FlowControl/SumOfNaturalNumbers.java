package FlowControl;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		// sum of natural numbers 5: 1+2+3+4+5
		
		int num = 1;
		
		if(num < 0) {
			System.out.println("Invalid Input");
			return;
		}
		
		System.out.println(num*(num+1)/2);
		
		

	}

}
