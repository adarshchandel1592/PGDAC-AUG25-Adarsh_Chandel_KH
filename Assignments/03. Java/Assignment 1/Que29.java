import java.util.Scanner;

class Que29{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int type;
		System.out.print("\nEnter day type (1-Workday, 2-Weekend): ");
		type=sc.nextInt();
		
		if(type==1){
			System.out.print("\nIt's Workday. Come on let's grind and be productive.\n");
		}
		else if(type==2){
			System.out.print("\nIt's Weekend. No work today.\n");
		}
		else{
			System.out.print("\nInvalid Input\n");
		}
	}
}