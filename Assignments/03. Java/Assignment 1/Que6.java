import java.util.Scanner;

class Que6{
	public static void main(String args[]){
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter year: ");
		year=sc.nextInt();
		
		if ((year%4==0 && year%100!=0) || year%400==0){
			System.out.print("\n" + year +" is a leap year\n");
		}
		else{
			System.out.print("\n" + year +" is not a leap year\n");
		}
	}
}