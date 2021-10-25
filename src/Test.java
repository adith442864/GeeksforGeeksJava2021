
/*
 * Difference betwee primitive and non primitive:
 * Non primitive variables are always reerences
 * memory of non primitive is always allocated on Heap
 * member of non primitive get default values like (int = variable get 0, boolean as false, )
 */

class Point
{
    int x;
    int y;
}

class Test
{ 
    public static void main(String[] args) 
    { 
       Point p = new Point();

       p.x = 10;
       p.y = 20;

       System.out.println(p.x + " " + p.y);
    } 
} 
