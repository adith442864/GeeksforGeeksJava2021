package InputAndOutputInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingAString {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	       System.out.println("Enter a String");

	       String s = br.readLine();

	       System.out.println("You Entered " + s);

	}

}
