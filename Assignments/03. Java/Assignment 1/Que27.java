import java.util.Scanner;

class Que27{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.print("\nEnter a character: ");
		ch=sc.next().charAt(0);
		
		switch (ch){
			case 'A':
				System.out.print("\nYou selected option A\n");
				break;
			case 'B':
				System.out.print("\nYou selected option B\n");
				break;
			case 'C':
				System.out.print("\nYou selected option C\n");
				break;
			case 'D':
				System.out.print("\nYou selected option D\n");
				break;
			case 'E':
				System.out.print("\nYou selected option E\n");
				break;
			default:
				System.out.print("\nInvalid selection. Select (A-E)\n");
		}
	}
}