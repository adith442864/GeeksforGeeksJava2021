package ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.size());
		
		al.add("geeks");
		al.add("ide");
		al.add("courses");
		System.out.println(al);
		
		al.add(1, "practice");
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains("ide"));
		
		
		al.remove(1);
		System.out.println(al);
		
		al.remove("courses");
		System.out.println(al);
		
		System.out.println(al.contains("courses"));
		
		al.clear();
		System.out.println(al);
		
		al.add("courses");
		al.add("ide");
		
		System.out.println(al.isEmpty()); //boolean return type
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(10);

		System.out.println(al1.size());
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		
		System.out.println(al1.indexOf(20));
		System.out.println(al1.lastIndexOf(10));
		System.out.println(al1.lastIndexOf(50));
		

	}

}
