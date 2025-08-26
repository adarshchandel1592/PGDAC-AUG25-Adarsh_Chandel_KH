public class AreaRectangle{
	public static void main(String[] args){
		
		int length = 5;
		int breadth = 9;
		//Print area of the rectangle
		
		if(length < 0 || breadth < 0){
			System.out.println("Length or Width of a rectangle cannot be negative");
		}
		
		else{
			int area = length * breadth;
			System.out.println("Length of rectangle is " + length);
			System.out.println("Width of rectangle is " + breadth);
			System.out.println("Area of rectangle is " + area);
		}
	}
}