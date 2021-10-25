package Operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		// Assignment operators : =, +=, -=, *=, %=
		
		int x=10, y=5,z;
		
		x+=y;
		System.out.println(x); //15
		
		x%=y;
		System.out.println(x); //0
		
		z=x=y;
		System.out.println(z); //5

	}

}
