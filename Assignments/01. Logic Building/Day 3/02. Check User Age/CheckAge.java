import java.util.Scanner;

class CheckAge{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		if (age < 18){
			System.out.println("You age is " + age + ". You are a minor");
		}
		
		else if (age >= 18 && age < 61){
			System.out.println("You age is " + age + ". You are an adult");
		}
		else{
			System.out.println("You age is " + age + ". You are a senior citizen");
		}
		
		sc.close();
	}
}