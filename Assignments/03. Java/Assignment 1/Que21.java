import java.util.Scanner;

class Que21{
	public static void main(String args[]){
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter day number: ");
		num=sc.nextInt();
		
		String result = (num==1) ? "\nDay is Monday\n" :
						(num==2) ? "\nDay is Tuesday\n" :
						(num==3) ? "\nDay is Wednesday\n" :
						(num==4) ? "\nDay is Thursday\n" :
						(num==5) ? "\nDay is Friday\n" :
						(num==6) ? "\nDay is Saturday\n" :
						(num==7) ? "\nDay is Sunday\n" :
						"\nInvalid Input. Enter number between (1-7)\n";
		
		System.out.print(result);
	}
}