import java.util.Scanner;

class Que14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num, units, tens, hundred, thousand;
		System.out.print("\nEnter 4-digit number: ");
		num=sc.nextInt();
		
		units=num%10;
		tens=(num/10)%10;
		hundred=(num/100)%10;
		thousand=num/1000;
		
		String rev=""+units+tens+hundred+thousand;
		
		System.out.print("\nReversed number: "+rev+"\n");
		
	}
}