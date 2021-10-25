package FlowControl;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a=5;
		int b=20;
		int c=15;
		
		if(a>=b && a>=c) {
			System.out.println("a is greatest");
		} else if(b>=a && b>=c) {
			System.out.println("b is greatest");
		}else {
			System.out.println("c is greatest");
		}
		
		// 2nd Method : Using Math Function
		
		int x =20;
		int y=12;
		int z=5;
		
		int ans1 = Math.max(a, b); // 10 and 12 -> 12
		int ans = Math.max(ans1, c); // 12 && 20 -> 20
		System.out.println(ans); // 20

	}

}
