package Loops;

import java.io.IOException;

public class Break1 {

	 public static void main(String[] args)throws IOException 
	    { 
	      for(int i=0; i<5; i++)
	      {
	          if(i==3)
	          {
	              break;
	          }
	          
	          System.out.println(i);
	      }

	    } 

}
