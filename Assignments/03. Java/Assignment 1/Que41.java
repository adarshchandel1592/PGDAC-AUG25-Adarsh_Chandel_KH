import java.util.Scanner;
class Que41{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int number, units, tens, hundreds, result;
		System.out.print("\nEnter number: ");
		number=sc.nextInt();
		
		units=number%10;
		tens=(number/10)%10;
		hundreds=number/100;
		
		result = (units*units*units) + (tens*tens*tens) + (hundreds*hundreds*hundreds);
		
		String res=(number==result) ? "\n" +number+" is an Armstrong number\n" : "\n" +number+" is not an Armstrong number\n";
		System.out.print(res);
	}
}