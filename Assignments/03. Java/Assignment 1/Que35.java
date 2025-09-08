import java.util.Scanner;
class Que35{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.print("\nEnter marks: ");
		marks=sc.nextInt();
		
		String result = (marks>=35) ? "\nPass\n" : "\nFail\n";
		System.out.print(result);
	}
}