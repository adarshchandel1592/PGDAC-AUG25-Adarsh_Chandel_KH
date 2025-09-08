import java.util.Scanner;

class Que2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("\nEnter salary for Company 1: ");
		a = sc.nextInt();
		
		System.out.print("\nEnter salary for Company 2: ");
		b=sc.nextInt();
		
		System.out.print("\nEnter salary for Company 3: ");
		c=sc.nextInt();
		
		if (a>b && a>c){
			System.out.print("\nCompany 1 offers highest salary\n");
		}
		
		else if (b>a && b>c){
			System.out.print("\nCompany 2 offers highest salary\n");
		}
		else{
			System.out.print("\nCompany 3 offers highest salary\n");
		}
	}
}