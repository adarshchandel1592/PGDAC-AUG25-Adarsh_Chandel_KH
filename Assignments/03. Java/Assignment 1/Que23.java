import java.util.Scanner;

class Que23{
	public static void main(String args[]){
		int num1, num2, result;
		char op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter first number: ");
		num1=sc.nextInt();
		System.out.print("\nEnter second number: ");
		num2=sc.nextInt();
		System.out.print("\nEnter operator: ");
		op=sc.next().charAt(0);
		
		switch (op){
			case '+':
				result=num1+num2;
				System.out.print("\nResult:"+result+"\n");
				break;
			case '-':
				result=num1-num2;
				System.out.print("\nResult:"+result+"\n");
				break;
			case '*':
				result=num1*num2;
				System.out.print("\nResult:"+result+"\n");
				break;
			case '/':
				if(num2==0){
					System.out.print("\nDivisibility by zero is invalid\n");
				}
				else{
					result=num1/num2;
					System.out.print("\nResult:"+result+"\n");
				}
				break;
			default:
				System.out.print("\nInvalid Operator\n");
		}
	}
}