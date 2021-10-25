import java.util.Scanner;

public class DaysBeforeNDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int d = sc.nextInt(); //3
        int n = sc.nextInt();//9
        
        int x = n % 7; // 9%7 = 2 
        int ans = d - x; //3-2=1 
       
        if(ans >= 0){
            System.out.println(ans);
        }else{
            System.out.println(7 + ans);
        }
		
	}

}
