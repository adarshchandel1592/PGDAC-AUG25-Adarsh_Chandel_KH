public class LargestNum{
	public static void main(String[] args){
		
		int a = 5, b = 9, c = 3;
		System.out.println("Num1 is " + a);
		System.out.println("Num2 is " + b);
		System.out.println("Num3 is " + c);
		
		if(a > b && a > c){
			System.out.println(a + " is the largest");
		}
		
		else{
			if(b > a && b > c){
				System.out.println(b + " is the largest");
			}
			
			else{
				System.out.println(c + " is the largest");
			}
		}
	}
}