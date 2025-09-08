import java.util.Scanner;
class Que43{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number, units, tens, hundreds, result;
		System.out.print("\nEnter number: ");
		number=sc.nextInt();
		
		units=number%10;
		tens=(number/10)%10;
		hundreds=number/100;
		
		result = units+hundreds+tens;
		
		System.out.print("\nSum of digits: "+result+"\n");
	}
}