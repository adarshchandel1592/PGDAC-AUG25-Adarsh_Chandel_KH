interface LandVehicle{
	public void driveOnLand();
}

interface WaterVehicle{
	public void driveOnWater();
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle{
	
	private String vehicle;
	
	AmphibiousVehicle(String vehicle){
		this.vehicle = vehicle;
	}
	
	public String getVehicle(){
		return vehicle;
	}
	
	public void setVehicle(String veh){
		this.vehicle = veh;
	}
	
	public void driveOnLand(){
		System.out.println("\n"+getVehicle()+" ----> Driving on Land");
	}
	
	public void driveOnWater(){
		System.out.println(getVehicle()+" ----> Driving on Water");
	}	
}

class Que22{
	public static void main(String args[]){
		
		AmphibiousVehicle l = new AmphibiousVehicle("HydroCar");
		AmphibiousVehicle w = new AmphibiousVehicle("HydroCar");
		
		l.driveOnLand();
		l.driveOnWater();
		System.out.println();
	}
}