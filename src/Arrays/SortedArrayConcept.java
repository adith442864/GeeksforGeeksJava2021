package Arrays;

public class SortedArrayConcept {

	public static void main(String[] args) {
		
		int arr[] = {10,50,30,40}, n=4;
		
		System.out.println(isSorted(arr, n));
		

	}
	
	
	public static boolean isSorted(int arr[], int n) {
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		
		return true;
		
	}

}
