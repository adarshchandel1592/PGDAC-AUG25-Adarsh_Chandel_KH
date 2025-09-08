class ShapeArea{
	private int side, length, breadth;
	private double radius;
	
	public int getSide(){
		return side;
	}
	
	public int getLength(){
		return length;
	}
	
	public int breadth(){
		return breadth;
	}
	
	public void setSide(int side){
		this.side = side;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	
	public void setBreadth(int breadth){
		this.breadth = breadth;
	}
	
	public void calculateArea(int s){
		this.side = s;
		
		int area = side * side;
		System.out.println("\nSquare Area = "+area);
	}
	
	public void calculateArea(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		
		int area = length * breadth;
		System.out.println("Rectangle Area = "+area);
	}
	
	public void calculateArea(double radius){
		this.radius = radius;
		
		double area = 3.14 * radius * radius;
		System.out.print("Circle Area = "+String.format("%.2f", area));
	}
}

class Que15{
	public static void main(String[] args){
		
		ShapeArea sa = new ShapeArea();
		sa.calculateArea(5);
		sa.calculateArea(4, 6);
		sa.calculateArea(3.0);
		System.out.println();
	}
}