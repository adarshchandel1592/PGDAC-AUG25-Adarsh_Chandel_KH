import java.util.Scanner;

class Que5{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int quantity = sc.nextInt();
		int total_products = sc.nextInt(); //5
		
		double[] array_products = new double[total_products];
		
		for(int i=0; i<array_products.length; i++){
			array_products[i] = sc.nextDouble();
		}
		
		int product_index = sc.nextInt();  //11
		
		try{
			double product_price = array_products[product_index];
			try{
				
				if(quantity == 0){
					throw new ArithmeticException();
				}
				else{
					System.out.println("Total Price: "+product_price * quantity);
				}
				
			}catch(ArithmeticException e){
				System.out.println("Arithmetic Exception Caught");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Exception");
		}
	}
}