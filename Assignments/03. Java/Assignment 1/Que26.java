import java.util.Scanner;

class Que26{
	public static void main(String args[]){
		int month;
		String season="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter month number: ");
		month=sc.nextInt();
				
		switch (month){
			case 12:
			case 1:
			case 2:
				season="Winter";
				break;
			case 3:
			case 4:
			case 5:
				season="Summer";
				break;
			case 6:
			case 7:
			case 8:
				season="Monsoon";
				break;
			case 9:
			case 10:
			case 11:
				season="Autumn";
				break;	
			default:
				System.out.print("\nInvalid month number\n");
		}
		
		System.out.print("\nSeason is "+season+"\n");
	}
}