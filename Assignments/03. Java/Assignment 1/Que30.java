import java.util.Scanner;
class Que30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, select;
		
		System.out.print("\nSelect operation (1-Addition, 2-Subtraction): ");
		select=sc.nextInt();
		System.out.print("\nEnter first number: ");
		num1=sc.nextInt();
		System.out.print("\nEnter second number: ");
		num2=sc.nextInt();
		
		if(select==1){
			System.out.print("\nResult: " +(num1+num2)+"\n");
		}
		else{
			if(select==2){
				System.out.print("\nResult: " +(num1-num2)+"\n");
			}
			else{
				System.out.print("\nInvalid selection\n");
			}
		}		
	}
}