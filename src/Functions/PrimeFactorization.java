package Functions;

import java.util.Scanner;

public class PrimeFactorization {
	
	// input : 50  and output : 2*5*5 = 50
	// input : 20  and output : 2*2*5 = 20
	// input : 13  and output : 13
	
	 public static boolean isPrime(int n){
	        for(int i=2;i<n;i++){
	            if(n%i==0){
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void printFactors(int n){
	        for(int i=2;i<=n;i++){
	            if(isPrime(i)){
	                int x=i;
	                while(n%x==0){
	                    System.out.print(i+" ");
	                    x=x*i;
	                }
	            }
	        }
	    }

	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();

	        printFactors(n);
	    }

}
