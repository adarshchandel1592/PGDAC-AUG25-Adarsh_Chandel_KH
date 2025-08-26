import java.util.Scanner;

class Table{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number whose multiplication table you wish to print: ");
		int num = sc.nextInt();
		System.out.println();
		System.out.println("Multiplication table of " + num + " is:");
		System.out.println();
		for (int i = 1; i < 11; i++){
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}