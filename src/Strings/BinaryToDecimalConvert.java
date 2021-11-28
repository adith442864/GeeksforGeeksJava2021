package Strings;

public class BinaryToDecimalConvert {

	public static void main(String[] args) {
		
		int m=0;
		int k=1; //power of 2
		
		String s="1010";
		
		for(int i=s.length()-1; i>=0; i--) {
			m+=(s.charAt(i)-'0')*k;
			k=k*2;
		}
		
		System.out.println(m);

	}

}
