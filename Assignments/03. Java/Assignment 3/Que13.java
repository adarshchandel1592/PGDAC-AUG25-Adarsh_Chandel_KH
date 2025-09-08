abstract class Shape{
	abstract public void draw();
}

class Circle extends Shape{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double rad){
		this.radius = rad;
	}
	
	public void draw(){
		System.out.println("\nDrawing Circle of radius "+radius);
	}
}

class Rectangle extends Shape{
	private double length, breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double len){
		this.length = len;
	}
	
	public double getBreadth(){
		return breadth;
	}
	
	public void setBreadth(double bre){
		this.breadth = bre;
	}
	
	public void draw(){
		System.out.println("Drawing Rectangle of length "+length+" and breadth "+breadth);
	}
}

class Que13{
	public static void main(String args[]){
		
		Shape c = new Circle(7);
		Shape r = new Rectangle(5, 10);
		
		c.draw();
		r.draw();
		System.out.println();
	}
}
