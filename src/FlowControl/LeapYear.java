package FlowControl;

public class LeapYear {

	public static void main(String[] args) {
		
		//2000 = Yes
		//2001 = No
		// Person Born on : 29th Feb 2000
		// 2000 2004 2008 2012 2016 2020
		
		// Rule1: Divisible by 4,  but not divisible by 100
			//Example: 1952, 1956, 1960
		
		// Rule2: Divisible by 400
			//Example: 2000, 2400, 2800
		
		//Rule3: Years like 2100,2300,2200 are not leap years:
		
		int Year = 2200;
		
		if(Year%4==0 && Year%100!=0) {
			System.out.println("Yes");
		}
		
		else if(Year % 400 ==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
