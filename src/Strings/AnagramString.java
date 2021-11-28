package Strings;

import java.util.Arrays;

public class AnagramString {
	
	public static boolean findAnagram(String s1, String s2) {
		
	// s1=	abaac
	// s2 = aacba
	// After sorting :
		//s1 = aaabc
		//s2=aaabc
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		//Sorting 1st Array:
		char[] a1 = s1.toCharArray();
		Arrays.sort(a1);
		s1=new String(a1);
		
		//Sorting 1st Array:
		char[] a2 = s2.toCharArray();
		Arrays.sort(a2);
		s2=new String(a2);
		
		return s1.equals(s2);
		
	}

	public static void main(String[] args) {
		
		String s1="abaac";
		String s2="aacba";
		
		System.out.println(findAnagram(s1, s2));
	
	}

}
