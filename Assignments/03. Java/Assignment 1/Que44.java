import java.util.Scanner;

class Que44{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num, units, tens, hundreds, result, thousands;
		String rev;
		System.out.print("\nEnter 4-digit number: ");
		num=sc.nextInt();
		
		units=num%10;
		tens=(num/10)%10;
		hundreds=(num/100)%10;
		thousands=num/1000;
		
		result = units*1000+tens*100+hundreds*10+thousands;
		System.out.print("\nReversed number: "+result+"\n");
		
		String res = (result==num) ? "\nPalindrome: Yes\n" : "\nPalindrome: No\n";
		System.out.print(res);
		
	}
}