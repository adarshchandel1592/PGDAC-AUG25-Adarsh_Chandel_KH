import java.util.Scanner;

class Que3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int transact;
		System.out.print("\nEnter transaction amount: ");
		transact = sc.nextInt();
		
		String result = (transact < 0) ? "\nWithdrawal Transaction\n" : "\nDeposit Transaction\n";
		System.out.print(result);
	}
}