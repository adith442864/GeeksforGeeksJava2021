package InputAndOutputInJava;

public class EscapeSequences {

	public static void main(String[] args) {
		
		String s ="Geeks for Geeks";
		System.out.println(s);
		
		System.out.println("Welcome to \"Geeks for Geeks\" "); 
		
		System.out.println("Hi, \nwelcome to the course");
		
//		System.out.println("let us use \ in the string"); throws errors:
		
		System.out.println("let us use \\ in the string");
		
		System.out.println("C:\\xyz\\abc.txt");
		
		// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )

	}

}
