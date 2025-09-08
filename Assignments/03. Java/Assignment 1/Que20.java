import java.util.Scanner;

class Que20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result;
		char input;
		System.out.print("\nEnter first number: ");
		num1=sc.nextInt();
		System.out.print("\nEnter second number: ");
		num2=sc.nextInt();
		System.out.print("\nEnter operator: ");
		input=sc.next().charAt(0);
		
		if(input=='+'){
			result=num1+num2;
			System.out.print("\nResult: "+result+"\n");
		}
		else{
			if(input=='-'){
				result=num1-num2;
				System.out.print("\nResult: "+result+"\n");
			}
			else{
				if(input=='*'){
					result=num1*num2;
					System.out.print("\nResult: "+result+"\n");
				}
				else{
					if(input=='/'){
						if(num2==0){
							System.out.print("\nDivisibility by zero. Not Possible\n");
						}
						else{
							result=num1/num2;
							System.out.print("\nResult: "+result+"\n");
						}
					}
					else{
						System.out.print("\nInvalid Operator\n");
					}
				}
			}
		}
	}
}