class Vehicle{
	private String brand;
	private int speed;
	
	public Vehicle(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setBrand(String br){
		this.brand = br;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int sp){
		this.speed = sp;
	}
}

class Car extends Vehicle{
	private String modelType;
	
	Car(String brand, String modelType, int speed){
		super(brand, speed);
		this.modelType = modelType;
	}
	
	public String getModelType(){
		return modelType;
	}
	
	public void setModelType(String mt){
		this.modelType = mt;
	}
}

class Bike extends Vehicle{
	private String modelType;
	
	Bike(String brand, String modelType, int speed){
		super(brand, speed);
		this.modelType = modelType;
	}
	
	public String getModelType(){
		return modelType;
	}
	
	public void setModelType(String mt){
		this.modelType = mt;
	}
}

class Que8{
	public static void main(String args[]){
		Car c = new Car("Honda", "Civic", 180);
		Bike b = new Bike("Yamaha", "R15", 120);
		
		System.out.println("\nCar: "+c.getBrand()+" "+c.getModelType()+", Speed = "+c.getSpeed());
		System.out.println("\nBike: "+b.getBrand()+" "+b.getModelType()+", Speed = "+b.getSpeed());
	}
}