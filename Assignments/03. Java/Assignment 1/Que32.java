import java.util.Scanner;
class Que32{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\nEnter a number: ");
		num=sc.nextInt();
		
		String result = (num>0) ? "\nNumber is positive\n" :
						(num<0) ? "\nNumber is negative\n" :
						"\nNumber is zero.\n";
		System.out.print(result);
	}
}