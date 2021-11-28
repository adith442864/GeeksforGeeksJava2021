package Strings;

public class ReverseString {

	public static void main(String[] args) {
	
		String str="geeks"; 
		//output : skeeg
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		StringBuilder sb= new StringBuilder(str);
		System.out.println(sb.reverse());
		
		// another approach:
		
		String a="welcome";
		String b="";
		
		int p = a.length()-1;
		
		while(p>=0) {
			b=b+a.charAt(p);
			p--;
		}
		
		System.out.println(b);
	}

}
