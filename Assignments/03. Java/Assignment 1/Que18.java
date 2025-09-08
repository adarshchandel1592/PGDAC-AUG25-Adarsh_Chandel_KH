import java.util.Scanner;
class Que18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.print("\nEnter day number: ");
		day=sc.nextInt();
		
		switch (day){
			case 1:
				System.out.print("\nDay is Monday\n");
				break;
			case 2:
				System.out.print("\nDay is Tuesday\n");
				break;
			case 3:
				System.out.print("\nDay is Wednesday\n");
				break;
			case 4:
				System.out.print("\nDay is Thursday\n");
				break;
			case 5:
				System.out.print("\nDay is Friday\n");
				break;
			case 6:
				System.out.print("\nDay is Saturday\n");
				break;
			case 7:
				System.out.print("\nDay is Sunday\n");
				break;
			default:
				System.out.print("\nInvalid. Enter day number between (1-7)\n");
		}
	}
}