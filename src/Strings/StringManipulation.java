package Strings;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="geeks";
		System.out.println(str.length());
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.substring(2));
		
		System.out.println(str.substring(2, 5));
		
		String s1="geeks";
		String s2="geeks";
		
		if(s1==s2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		String s3 = new String("geeks");
		
		if(s1==s3) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		//contains:
		s1="geeksforgeeks";
		s2="geeks";
		
		System.out.println(s1.contains(s2));
		
		//equals()
		String s4="geeksforgeeks";
		String s5="geeksforgeeks";
		
		System.out.println(s3.equals(s4));
		
		
		//compareTo()
		String s6="geeksforgeeks";
		String s7="for";
		
		int res = s6.compareTo(s7);
		if(res==0) 
			System.out.println("same");
		if(res>0) {
			System.out.println("s7 Greater");
		}
		if(res<0)
			System.out.println("s7 smaller");
		
		
		//equalsIgnoreCase
		String str1 ="HEllO";
		String str2="hELLo";
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//toUppercase
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		
		//substring:
		str="geeksforgeeks"; // 01234
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(1));
		System.out.println(str.substring(4, str.length()));
		
		
		
		
		
		
		

	}

}
