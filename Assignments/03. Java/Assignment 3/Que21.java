class Staff{
	private String name;
	private int staffid;
	
	Staff(String n, int id){
		this.name = n;
		this.staffid = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getID(){
		return staffid;
	}
		
	public void setID(int id){
		this.staffid = id;
	}
	
	public void displayDetails(){
		System.out.print("\n"+getName()+" ---> Staff ID = "+getID());
	}
}

class Doctor extends Staff{
	private String specialization;
	
	Doctor(String n, int id, String spec){
		super(n, id);
		this.specialization = spec;
	}
	
	public String getSpec(){
		return specialization;
	}
	
	public void setSpec(String spec){
		this.specialization = spec;
	}
	
	public void displayDetails(){
		System.out.print("\n"+getName()+" ---> Staff ID = "+getID()+", Specialization = "+getSpec());
	}
}

class Nurse extends Staff{
	private String shift;
	
	Nurse(String n, int id, String shift){
		super(n, id);
		this.shift = shift;
	}
	
	public String getShift(){
		return shift;
	}
	
	public void setShift(String shift){
		this.shift = shift;
	}
	
	public void displayDetails(){
		System.out.print("\n"+getName()+" ---> Staff ID = "+getID()+", Shift = "+getShift());
	}
}

class Que21{
	public static void main(String args[]){
		
		Staff d = new Doctor("Dr. Reddy", 101, "Cardiology");
		Staff n = new Nurse("Nisha", 102, "Night");
		
		d.displayDetails();
		n.displayDetails();
		System.out.println();
	}
}
