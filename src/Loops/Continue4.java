package Loops;

import java.io.IOException;
import java.util.Scanner;

public class Continue4 {
	
	 public static void main(String[] args)throws IOException 
	    { 
	      Scanner sc = new Scanner(System.in);

	      for(int i=0; i<5; i++)
	      {
	        int x = sc.nextInt();
	        int y = sc.nextInt();

	        if(y==0)
	            continue;
	        System.out.println(x/y);
	      }

	    } 

}
