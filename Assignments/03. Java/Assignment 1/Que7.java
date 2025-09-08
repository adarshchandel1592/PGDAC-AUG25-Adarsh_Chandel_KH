import java.util.Scanner;

class Que7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int marks;
		System.out.print("\nEnter marks: ");
		marks=sc.nextInt();
		
		String result = (marks>=35) ? "\nStudent has passed\n" : "\nStudent has failed\n";
		System.out.print(result);
	}
}