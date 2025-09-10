import java.util.Scanner;

class AgeRestriction extends Exception{
	AgeRestriction(){
	super("AgeNotValidException: Age must be >= 18");
	}
}

class Que6{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try{
			if(age>=18){
				System.out.println("You are eligible.");
			}else{
				throw new AgeRestriction();
			}
		}catch(AgeRestriction e){
			System.out.println(e.getMessage());
		}
	}
}