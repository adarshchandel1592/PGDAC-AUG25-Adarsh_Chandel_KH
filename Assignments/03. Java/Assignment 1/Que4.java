import java.util.Scanner;

class Que4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("\nEnter locker number: ");
		number = sc.nextInt();
		
		String result = (number%2==0) ? "\nEven locker number\n" : "\nOdd locker number\n";
		System.out.print(result);
	}
}