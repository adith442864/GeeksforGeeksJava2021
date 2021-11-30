package ArrayList;

import java.util.ArrayList;

public class ArrayListInsert {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
//		al.ensureCapacity(100); pre allocate the space for 100;
		
		for(int i=0; i<=100; i++) {
			al.add(i);
		}
		
		System.out.println(al);
		
		// 1.5 times virtual capacity will be maximized as per wikipedia
		// 2 times virtual capacity space will be created when data inserts. 

	}

}
