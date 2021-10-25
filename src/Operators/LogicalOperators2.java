package Operators;

import java.util.Scanner;

public class LogicalOperators2 {

	public static void main(String[] args) {
		
		// Logical Operators: $$, ||, !
		
		String user = "geek" , pwd = "GEEK";
	      
        Scanner sc = new Scanner(System.in);
      
        String iu = sc.next();
      
        String ip = sc.next();
      
        if(user.equals(iu) && pwd.equals(ip))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Try Again");
        }
		

	}

}
