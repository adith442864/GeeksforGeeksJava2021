package Strings;

public class Palindrome {

	public static void main(String[] args) {
		
		// abba , a, abcba
		
		String str = "abba";
		
		int start=0;
		int end = str.length()-1;
		
		boolean isPal = true;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				isPal=false;
				break;
			}
			
			start++;
			end--;
		}
		
		if(isPal==true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
