import java.util.Scanner;

abstract class Shape{
	public abstract double area(double length, double breadth); 
}

class Rectangle extends Shape{
	double length, breadth;
	
	public double area(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
		double area = length * breadth;
		System.out.print("Rectangle area = " + area);
		System.out.println();
		return area;
	}
}

class Circle extends Shape{
	double radius, pi;
	
	public double area(double pi, double rad){
		this.pi = pi;
		this.radius = rad;
		double area = pi * rad * rad;
		System.out.print("Circle Area = " + area);
		return area;
	}
}

class Que6{
	public static void main(String args[]){
		
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Scanner sc = new Scanner(System.in);
		
		double len, bre, rad, pi;
		
		System.out.print("\nFOR RECTANGLE");
		System.out.print("\nEnter the length of rectangle: ");
		len = sc.nextDouble();
		
		System.out.print("Enter the breadth of rectangle: ");
		bre = sc.nextDouble();
		
		r.area(len, bre);
		
		System.out.print("\nFOR CIRCLE");
		System.out.print("\nEnter the radius of the circle: ");
		rad = sc.nextDouble();
		pi = 3.14;
		
		c.area(pi, rad);
		System.out.println();
	}
}