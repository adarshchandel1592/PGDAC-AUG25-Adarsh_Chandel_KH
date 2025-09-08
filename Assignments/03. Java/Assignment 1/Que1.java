import java.util.Scanner;

class Que1{
	public static void main(String args[]){
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter score for Test 1: ");
		a=sc.nextInt();
		
		System.out.print("\nEnter score for Test 2: ");
		b=sc.nextInt();
		
		String result = (a > b) ? "\nTest 1 has higher score" : "\nTest 2 has higher score";
		
		System.out.println(result);
		/* 
		if (a > b){
			System.out.print("\nTest 1 has higher score\n");
		}
		else{
			System.out.print("\nTest 2 has higher score\n");
		}
		*/
	}
}