package ArrayList;

import java.util.ArrayList;

public class SeperateODDEven {
	
	
	public static void main(String args[]) {
		
		int arr[] = {10,11,15,20};
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		
		System.out.println("Even Numbers are :" +even);
		System.out.println("Odd Numbers are : " +odd);
		
		
	}

}
