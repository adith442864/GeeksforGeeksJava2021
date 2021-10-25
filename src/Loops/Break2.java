package Loops;

import java.io.IOException;

public class Break2 {
	
	 public static void main(String[] args)throws IOException 
	    { 
	      for(int i=0; i<2; i++)
	      {
	         for(int j=0; j<2; j++)
	         {
	             if(j==1)
	             break;
	             
	             System.out.println(j);
	         }
	      }

	    } 

}
