import java.util.Scanner;

class Que25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("\nEnter a number: ");
		num=sc.nextInt();
		
		switch (num){
			case 1:
				System.out.print("\nYou selected option 1\n");
				break;
			case 2:
				System.out.print("\nYou selected option 2\n");
				break;
			case 3:
				System.out.print("\nYou selected option 3\n");
				break;
			case 4:
				System.out.print("\nYou selected option 4\n");
				break;
			case 5:
				System.out.print("\nYou selected option 5\n");
				break;
			default:
				System.out.print("\nInvalid selection. Select (1-5)\n");
		}
	}
}