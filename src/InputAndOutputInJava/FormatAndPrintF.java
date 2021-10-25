package InputAndOutputInJava;

public class FormatAndPrintF {

	public static void main(String[] args) {
		
		   int x = 100, y = 200;
	       
	       System.out.format("Value of x is %d\n", x); //placeholder %d is replaced by x value.
	       
	       float z = (float)Math.PI;
	       
	       System.out.println(y);
	       
	       System.out.format("Value of PI = %.2f\n", z); //print two digits after the decimal point
	       System.out.format("Value of PI = %5.2f\n", z); //Value of PI =  3.14 -> took extra space filled by character and two decimal points.
	       System.out.format("Value of PI = %05.2f\n", z); //Value of PI = 03.14
	       
	       System.out.printf("x = %d, y = %d", x, y); //value of placeholder is replaced by x and y value.

	}

}
