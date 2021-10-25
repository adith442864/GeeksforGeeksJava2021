
class point1
{
    int x;
    int y;
}

public class NonPrimitiveExample2
{ 
    public static void main(String[] args) 
    { 
       point1 p1 = new point1();

       p1.x = 10;
       p1.y = 20;

       point1 p2 = p1; // 10 20

       p2.x = 30;

       System.out.println(p1.x); //30
       System.out.println(p2.x); // 30
    } 
} 

