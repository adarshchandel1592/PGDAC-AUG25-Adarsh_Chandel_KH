class Vehicle{
	private String regNo, ownerName, vehicleType;
	private static int vehicleCount;

	Vehicle(String owner, String vehType){
		vehicleCount++;
		this.regNo = "MH-2025-" + vehicleCount;
		this.ownerName = owner;
		this.vehicleType = vehType;
	}
	
	public String getRegNo(){
		return regNo;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public String getVehicleType(){
		return vehicleType;
	}
	
	public void printVehicleDetails(){
		System.out.println("Registration No: "+regNo+", Owner Name: "+ownerName+", Vehicle Type: "+vehicleType);
	}
}

class Que18{
	public static void main(String args[]){
		Vehicle v1 = new Vehicle("Niharika Sargavnkar", "Sedan");
		Vehicle v2 = new Vehicle("Mahendra Madan", "SUV");
		Vehicle v3 = new Vehicle("Arvind Anuj", "Jeep");
		System.out.println();
		
		v1.printVehicleDetails();
		v2.printVehicleDetails();
		v3.printVehicleDetails();
		
	}
}
