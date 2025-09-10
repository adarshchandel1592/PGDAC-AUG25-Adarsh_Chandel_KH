import java.util.Scanner;

class Que3{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		try{
			int age = Integer.parseInt(input);
			System.out.println("Age entered is "+age);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid number format");
		}
		
	}
}