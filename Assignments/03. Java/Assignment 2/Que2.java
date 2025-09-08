class Mobile{
	private String model; //Instance Variable to contain the model names of mobile phones
	static int totalMobiles; //static variable to store the count of total mobile
	
	Mobile(String modelname){ //Constructor to initialise or pass arguments to instance variables
		this.model = modelname;
		totalMobiles++; //Increments the count of total mobiles when called 
	}
	
	public String getModelName(){ // gets the name of the model entered according to the refernce created for every object;
		return model;
	}
	
	public static int showTotalMobiles(){ // returns the final count of total mobile phones in stock
		return totalMobiles;
	}	
}

class Que2{
	public static void main(String args[]){
		Mobile m1 = new Mobile("Samsung Galaxy M32"); //passes the argument or value of each references of objects via the Constructor
		Mobile m2 = new Mobile("Redmi Note 12");
		
		System.out.print("\nMobile1 model: "+m1.getModelName());
		System.out.print("\nMobile2 model: "+m2.getModelName());
		System.out.print("\nTotal mobiles in stock: "+Mobile.totalMobiles);
		System.out.println();
	}
}