import java.util.Scanner;
class Que40{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int pur_amount;
		System.out.print("\nEnter purchase amount: ");
		pur_amount=sc.nextInt();
		
		String result = (pur_amount>1000) ? "\nTotal cost after discount: " +(pur_amount - (pur_amount*0.1))+"\n" : "\nNo Discount. Total cost: " +pur_amount+"\n";
		System.out.print(result);
	}
}