import java.util.Scanner;

class Que5{
	public static void main(String args[]){
		int length, breadth;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter length: ");
		length = sc.nextInt();
		System.out.print("\nEnter breadth: ");
		breadth=sc.nextInt();
		
		String result = (length==breadth) ? "\nSquare Garden\n" : "\nRectangle Garden\n";
		System.out.print(result);
		
	}
}