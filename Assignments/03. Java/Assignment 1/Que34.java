import java.util.Scanner;
class Que34{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("\nEnter age: ");
		age=sc.nextInt();
		
		String result = (age>=18) ? "\nEligible to vote\n" : "\nNot eligible to vote\n";
		System.out.print(result);
	}
}