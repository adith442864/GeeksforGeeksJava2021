package Arrays;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {
		
		int arr[][] = { {1,2,3},{4,5,6} };
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
		}
		
		// java doesn't allow this specification:
		// int arr[2][3] --> invalid
		// int arr[][3] --> invalid
		
		System.out.println();
		
		int m=2, n=3;
		int arr1[][] = new int[m][n];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j]=10;
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		//Jagged array:
		int a=3;
		int arr2[][]= new int[a][];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = new int[i+1];
			
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j]=i;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
