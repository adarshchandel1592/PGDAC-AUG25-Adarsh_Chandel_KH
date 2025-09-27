import java.util.Scanner;

class Q3_Recursive{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		
		if(num<0){
			System.out.println("Enter a positive integer");
		}
		
		else{
			int result = factorial(num);
			System.out.println(result);
		}
		
		
	}
	
	static int factorial(int num){
		if(num==0){
			return 1;
		}
		return num*factorial(num-1);
	}
}