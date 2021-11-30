package ArrayList;

import java.util.ArrayList;

public class GetSmallerElements {

	public static void main(String[] args) {
		
		int arr[] = {8,100,20,40,3,7};
		int x=10;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<x) {
				al.add(arr[i]);
			}
		}
		
		System.out.println(al);

	}

}
