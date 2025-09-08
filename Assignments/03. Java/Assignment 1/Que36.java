import java.util.Scanner;

class Que36{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.print("\nEnter numbers (separated by space): ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		String result = (num1<=num2 && num1<=num3) ? "\nSmallest number: "+num1+"\n" : 
						(num2<=num1 && num2<=num3)? "\nSmallest number: " +num2+"\n":
						"\nSmallest number: " +num3+"\n";
		System.out.print(result);
	}
}