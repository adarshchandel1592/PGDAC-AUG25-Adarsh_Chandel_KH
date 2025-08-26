import java.util.Scanner;

class UserInputNumber{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2= sc.nextInt();
		
		System.out.println("The sum of "+ num1 + " and" + num2 + " is: " + (num1 + num2));
		
		sc.close();
	}
}