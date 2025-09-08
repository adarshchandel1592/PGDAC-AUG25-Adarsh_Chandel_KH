class Vehicle{
	
	public void displaySpeed(){
		System.out.println("\nVehicle speed unkown");
	}
}

class Car extends Vehicle{
	
	private String vehicleType;
	private int speed;
	
	Car(String veh, int speed){
		this.vehicleType = veh;
		this.speed = speed;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void displaySpeed(){
		System.out.print("\n"+getVehicleType()+", Speed = "+getSpeed()+" km/h");
	}
}

class Bike extends Vehicle{
	private String vehicleType;
	private int speed;
	
	Bike(String veh, int speed){
		this.vehicleType = veh;
		this.speed = speed;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void displaySpeed(){
		System.out.print("\n"+getVehicleType()+", Speed = "+getSpeed()+" km/h");
	}
}

class Que17{
	public static void main(String args[]){
		
		Vehicle c = new Car("Car", 120);
		Vehicle b = new Bike("Bike", 80);
		
		c.displaySpeed();
		b.displaySpeed();
		System.out.println();
	}
}