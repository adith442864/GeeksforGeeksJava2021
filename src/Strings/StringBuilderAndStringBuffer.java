package Strings;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		
		// Immutable String:
		String s1="geeks"; //s1 object stores the value = geeks
		String s2=s1; //s2 object stores the value of s1 = geeks
		
		s1=s2+"forgeeks"; //now s1 object stores the value = geeksforgeeks
		
		if(s1==s2) { //geeksforgeeks Not equal to geeks
			System.out.println("same");
		}else {
			System.out.println("not same"); //not same
		}
		
		//Mutable String : SingleThread
		StringBuilder sb1 = new StringBuilder("geeks");
		StringBuilder sb2 = sb1;
		
		sb1=sb1.append("forgeeeks");
		if(sb1==sb2) { 
			System.out.println("same"); //same
		}else {
			System.out.println("Not same");
		}
		
		//Mutable String : Multi-thread
		StringBuffer strbuffer1 = new StringBuffer("geeks");
		StringBuffer strbuffer2 = strbuffer1;
		
		sb1=sb1.append("forgeeeks");
		
		if(strbuffer1==strbuffer2) { 
			System.out.println("same"); //same
		}else {
			System.out.println("Not same");
		}
				
		
	
	}

}
