import java.util.Scanner;

class Que37{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("\nEnter year: ");
		year=sc.nextInt();
		
		String result = ((year%4==0 && year%20!=0) || year%400==0) ? "\nLeap Year\n" : "\nNot a leap year\n";
		System.out.print(result);
	}
}