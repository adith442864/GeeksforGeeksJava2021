package Loops;

import java.io.IOException;

public class Continue1 {
	
	 public static void main(String[] args)throws IOException 
	    { 
	      for(int i=0; i<5; i++)
	      {
	          if(i==1 || i==2) //0 3 4
	          {
	              continue;
	          }
	          
	          System.out.println(i);
	      }

	    } 

}
