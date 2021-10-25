package Operators;

public class OperatorsInJava {

	public static void main(String[] args) {
	
		int x=10, y=20;
		System.out.println(x+y); //30
		
		System.out.println(x*y); //200
		System.out.println(y/x); //2
		
		int z=(x+y*10); //210
		System.out.println(z); //210
		
		z=x++; //10
		System.out.println(z+ " " +x); // 10 11
		
		z=++x; //11
		
		System.out.println(z+ " " +x); // 12 12
		

	}

}
