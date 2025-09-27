import java.util.Scanner;

class Q3_Iterative{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		
		if(num==0){
			System.out.println("\nFactorial of 0 is 1");
		}
		else if(num<0){
			System.out.println("Enter a positive integer");
		}
		
		for(int i=num; i>=1; i--){
			fact *= i;
		}
		
		System.out.println(fact);
	}
}