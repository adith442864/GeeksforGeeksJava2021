package Strings;

public class PatternSearching {
	
	// String Pattern:
	public static void patSearch(String txt, String pat) {
		
		int pos = txt.indexOf(pat);
		
		while(pos>=0) {
			System.out.print(pos+" ");
			
			pos=txt.indexOf(pat, pos+1);
			
		}
		
	}
	
	
	//2. Decmimal Number Pattern:
	public static String digitsAfterDecimal(String no) {
		
		int pos = no.indexOf(".");
		
		if(pos<0) 
			return " ";
		else 
			return no.substring(pos+1);
		
		
	}

	public static void main(String[] args) {
		
		String txt ="geeks for geeks";
		String pat ="geeks";
		
		String no="12.3485";
		
		
		patSearch(txt, pat);
		
		System.out.println();
		
		System.out.println(digitsAfterDecimal(no));

	}

}
