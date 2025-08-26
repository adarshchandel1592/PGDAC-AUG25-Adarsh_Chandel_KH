public class AreaSqaure{
	public static void main(String[] args){
		
		int side = 15;
		
		//Print area of the square
		
		if(side < 0){
			System.out.println("Side of a square cannot be negative");
		}
		
		else{
			int area = side * side;
			System.out.println("Side of square is " + side);
			System.out.println("Area of square is " + area);
		}
	}
}