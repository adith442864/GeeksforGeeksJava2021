package Strings;

public class PatternSearch {

	public static void main(String[] args) {
		
		String str="AAAA";
		String pat="AAA";
		
		for(int i=0; i<str.length()-pat.length()+1; i++) {
			
			str.subSequence(i, i+pat.length()).equals(pat);
			System.out.print(i+" ");
			
			
		}
		
		
		
		
		
		

	}

}
