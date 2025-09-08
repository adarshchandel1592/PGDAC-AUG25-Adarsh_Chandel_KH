import java.util.Scanner;

class Que15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num, units, tens, hundreds, thousands, sum1, sum2;
		System.out.print("\nEnter 4-digit number: ");
		num=sc.nextInt();
		
		units=num%10;
		tens=(num/10)%10;
		hundreds=(num/100)%10;
		thousands=num/1000;
		
		sum1=thousands+hundreds;
		sum2=units+tens;
		
		if (sum1==sum2){
			System.out.print("\nLucky number\n");
		}
		else{
			System.out.print("\nNot a lucky number\n");
		}
	}
}