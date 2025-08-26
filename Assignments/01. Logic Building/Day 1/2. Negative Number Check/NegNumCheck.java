public class NegNumCheck{
	public static void main(String[] args){
		
		int num = -21;
		
		// Check the number
		
		if (num < 0){
			System.out.println("Number " + num + " is negative");
		}
		
		else{
			if (num == 0){
				System.out.println(num + " is neither positive nor negative");
			}
			
			else{
				System.out.println("Number " + num + " is not negative");
			}
		}
	}
}