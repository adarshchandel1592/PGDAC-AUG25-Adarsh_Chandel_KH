import java.util.Scanner;
class Que33{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\nEnter a number: ");
		num=sc.nextInt();
		
		String result = (num%2==0) ? "\nNumber is even\n" : "\nNumber is odd\n";
		System.out.print(result);
	}
}