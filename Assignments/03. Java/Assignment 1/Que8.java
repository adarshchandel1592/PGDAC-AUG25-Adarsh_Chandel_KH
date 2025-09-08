import java.util.Scanner;

class Que8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int pur_amount;
		System.out.print("\nEnter purchase amount: ");
		pur_amount=sc.nextInt();
			
		System.out.print("\nFinal cost after discount: " + (int)(pur_amount - (pur_amount*0.1)) + "\n");
	}
}