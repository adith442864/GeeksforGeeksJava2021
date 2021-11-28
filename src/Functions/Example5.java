package Functions;

import java.io.IOException;


public class Example5
{ 
    public static void main(String[] args)throws IOException 
    { 
     
        Point1 p = new Point1();
        
        p.x = 5; p.y = 10;
        
        fun(p);
        
        System.out.println(p.x +" "+ p.y);
    } 
    
    public static void fun(Point1 p)
    {
        p.x = 10; p.y = 10;
    }
    
    
} 


class Point1 {
	
	int x;
	int y;
}