import java.util.Scanner;

class Que31{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("\nEnter first number: ");
		num1=sc.nextInt();
		System.out.print("\nEnter second number: ");
		num2=sc.nextInt();
		
		String result = (num1>num2) ? "\nGreatest number: "+num1+"\n" : "\nGreatest number: " +num2+"\n";
		System.out.print(result);
	}
}