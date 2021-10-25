package Loops;

import java.io.IOException;

public class Continue2 {
	 public static void main(String[] args)throws IOException 
	    { 
	      for(int i=0; i<5; i++)
	      {
	          if(i==1 || i==3)
	          {
	              continue;
	          }
	          
	          System.out.println(i);
	      }

	    } 

}
