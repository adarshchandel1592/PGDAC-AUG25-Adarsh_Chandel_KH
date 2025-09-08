import java.util.Scanner;

class Que17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("\nEnter number: ");
		num=sc.nextInt();
		
		if(num%2==0){
			System.out.print("\nDivisible by 2\n");
			if(num%3==0){
				System.out.print("\nDivisible by 3\n");
				if(num%5==0){
				System.out.print("\nDivisible by 5\n");
			}
				else{
				System.out.print("\nNot divisible by 5\n");
				}
			}
			else{
				System.out.print("\nNot divisible by 3\n");
			}
		}
		
		else{
			System.out.print("\nNot divisible by 2\n");
		}
	}
}