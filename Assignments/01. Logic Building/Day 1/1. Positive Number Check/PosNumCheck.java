public class PosNumCheck{
	public static void main(String[] args){
		
		int num = 10;
		
		// Check the number
		
		if (num < 0){
			System.out.println("Number " + num + " is not positive");
		}
		
		else{
			if (num == 0){
				System.out.println(num + " is neither positive nor negative");
			}
			
			else{
				System.out.println("Number " + num + " is positive");
			}
		}
	}
}