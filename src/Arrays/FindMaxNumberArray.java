package Arrays;

public class FindMaxNumberArray {
	
	public static void maxFunction(int arr[]) {
		
		int max = Integer.MIN_VALUE; //store the min value in max variable
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) { //compare if min value is less than the array element
				max=arr[i];
			}
			
			
		}
		System.out.println(max);
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {10,9,11,5,1};
		
		maxFunction(arr);
		

	}

}
