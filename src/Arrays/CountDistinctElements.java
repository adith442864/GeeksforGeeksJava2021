package Arrays;

public class CountDistinctElements {

	public static int countDigits(int[] a,int n){
       
		int count=0;
		boolean isDistinct=true;
		
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(a[i]==a[j]){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct==true){
                count++;
            }
            isDistinct=true;
        }
        return count;
    }

    public static void main(String[] args){
        
    	int arr[]= {10,20,10,20,30,40};
    	
    	int n=arr.length;
    	
    	System.out.println(countDigits(arr, n));
    }

}
