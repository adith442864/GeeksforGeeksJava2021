package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("geeksforgeeks");
		al.add("ide");
		al.add("courses");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//for each loop:
		for(String aList:al) {
			System.out.println(aList);
		}
		
		//Iterator:
		
		Iterator it =  al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		//Remove an item during traversal:
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		
		Iterator it1 = aList.iterator();
		while(it.hasNext()) {
			int x = (Integer)it.next();
			if(x<10) {
				it1.remove();
			}else {
				System.out.println(x);
			}
		}
		
		//For each method:
		aList.forEach(x->System.out.println(x));
		
		//Practice
		for(int i=0; i<aList.size(); i++) {
			int x = aList.get(i);
			aList.set(i, x*2);
		}
		
		System.out.println(aList);
		
	}

}
