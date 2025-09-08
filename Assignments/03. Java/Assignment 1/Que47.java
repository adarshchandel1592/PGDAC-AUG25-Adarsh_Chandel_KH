import java.util.Scanner;

class Que47{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String flag1="", flag2=""	;
		
		System.out.print("\nEnter first number: ");
		num1=sc.nextInt();
		
		System.out.print("\nEnter second number: ");
		num2=sc.nextInt();
		
		if(num1%2==0){
			flag1="Even";
			if(num2%2==0){
				flag2="Even";
			} else{
				flag2="Odd";
			} if(flag1==flag2){
				System.out.print("\nNumbers are even\n");
			} else{
				System.out.print("\nNumbers are mixed (one even, one odd)\n");}
		}
		else{
			flag1="Odd";
			if(num2%2==0){
				flag2="Even";
			} else{
				flag2="Odd";
			} if(flag1==flag2){
				System.out.print("\nNumbers are odd\n");
			} else{
				System.out.print("\nNumbers are mixed (one even, one odd)\n");
			}
		}		
	}
}
