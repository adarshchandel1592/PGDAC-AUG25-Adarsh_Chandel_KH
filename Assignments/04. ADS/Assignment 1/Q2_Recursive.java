import java.util.*;

public class Q2_Recursive{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		
		
        System.out.println();
        int num = sc.nextInt();
		
		if(num<0){
			System.out.println("Enter a positive number");
		} else if(num ==0 && num==1){
			System.out.println("false");
		} else{
			int count = isPrime(num, 1, 0);
			if(count==2){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}		
		
    }
	
	static int isPrime(int num, int i, int count){
		if(i>num){
			return count;
		}
		
		if(num%i==0){
			count++;
		}
		
		return isPrime(num, i+1, count);
		
	}
}
