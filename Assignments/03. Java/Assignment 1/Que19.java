import java.util.Scanner;

class Que19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\nEnter month number: ");
		num=sc.nextInt();
		
		switch (num){
			case 1:
				System.out.print("\n31 days\n");
				break;
			case 2:
				System.out.print("\n28 or 29 days\n");
				break;
			case 3:
				System.out.print("\n31 days\n");
				break;
			case 4:
				System.out.print("\n30 days\n");
				break;
			case 5:
				System.out.print("\n31 days\n");
				break;
			case 6:
				System.out.print("\n30 days\n");
				break;
			case 7:
				System.out.print("\n31 days\n");
				break;
			case 8:
				System.out.print("\n31 days\n");
				break;
			case 9:
				System.out.print("\n30 days\n");
				break;
			case 10:
				System.out.print("\n31 days\n");
				break;
			case 11:
				System.out.print("\n30 days\n");
				break;
			case 12:
				System.out.print("\n31 days\n");
				break;
			default:
				System.out.print("\nInvalid Input. Enter month number (1-12)\n");
		}
	}
}