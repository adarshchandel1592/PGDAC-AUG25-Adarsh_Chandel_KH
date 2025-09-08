interface Shape{
	public void calculateArea();
}

class Circle implements Shape{
	private double radius;
	
	Circle(double rad){
		this.radius = rad;
	}
	
	// Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
	
	public void calculateArea(){
		double pi = 3.14;
		System.out.println("\nCircle Area = "+ pi * getRadius() * getRadius());
	}
}

class Rectangle implements Shape{
	private double length, breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	// Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for breadth
    public double getBreadth() {
        return breadth;
    }

    // Setter for breadth
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
	
	public void calculateArea(){
		System.out.println("Rectangle Area = "+ getLength() * getBreadth());
	}
}

class Square implements Shape{
	private double side;
	
	Square(double side){
		this.side = side;
	}
	
	// Getter for side
    public double getSide() {
        return side;
    }

    // Setter for side
    public void setSide(double side) {
        this.side = side;
    }
	
	public void calculateArea(){
		System.out.println("Square Area = "+ getSide() * getSide());
	}
}

class Que27{
	public static void main(String args[]){
		
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(10, 5);
		Square s = new Square(4.0);
		
		c.calculateArea();
		r.calculateArea();
		s.calculateArea();
		System.out.println();
	}
}