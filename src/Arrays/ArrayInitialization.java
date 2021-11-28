package Arrays;

public class ArrayInitialization {
	
	public static void main(String args[]) {
		
		int[] a={10,20,30,40};
        System.out.println(a.length);
        a[2]=50;
//        System.out.println(a[2]);
//        System.out.println(a[1]);
        
        
        //Approach of initializing the Arrays:
        int[] a1;
        a1=new int[3];
        a1[0]=10;
        a1[1]=20;
        a1[2]=30;
        
        int []a2 = new int[3];
        a2[0]=10;
        a2[1]=20;
        a2[2]=30;
        
        int x=10;
        for(int i=0; i<a2.length; i++) {
        	a[i]=x;
        	x=x+10;
        }
        
        System.out.println(x);
        
	}

}
