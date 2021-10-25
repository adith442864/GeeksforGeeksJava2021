package Operators;

public class LogicalOperators1 {

	public static void main(String[] args) {
		
		boolean x = true, y = false;
	       
        System.out.println(x && y);
       
        System.out.println(x || y);
       
        System.out.println( !x );
        
        //short circuit operator:
        String s = null;
        
        if(s!=null && s.length()<100)
        	System.out.println("invalid");
        
        else
        	System.out.println("valid");

	}

}
