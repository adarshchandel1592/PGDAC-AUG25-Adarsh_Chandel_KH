class TeaCup{
	private String teaType; //Instance Variable to store or say the type of tea
	static int totalCups; //Static Variable to count total cups made
	
	TeaCup(String tea){ //Constructor to initialise my instance variable
		this.teaType = tea; //saves the passed argument to the instance variable
		totalCups++; // Counter to increase the count of total cups made whenever called 
	}
	
	public String getTeaType(){ //getter function to get the value of tea type
		return teaType;
	}
	
	public static int showTotalCups(){ //returns the count of total tea cups made
		return totalCups; 
		/* We can also use void in place of int and change 
		our code from return statement to 
		System.out.print("\nTotal cups made: "+totalCups);
		System.out.println();
		*/
	}
}

class Que1{
	public static void main(String args[]){
		TeaCup t1 = new TeaCup("Masala Tea"); //1st Constructor to intialise instance variable
		TeaCup t2 = new TeaCup("Green Tea"); //2nd
		TeaCup t3 = new TeaCup("Ginger Tea"); //3rd
		
		System.out.print("\nCup1 type: "+t1.getTeaType()); //Prints the value of every tea type when method is called
		System.out.print("\nCup2 type: "+t2.getTeaType());
		System.out.print("\nCup3 type: "+t3.getTeaType());
		
		System.out.print("\nTotal cups made: "+TeaCup.totalCups); //Prints the total tea cups count
		System.out.println();
	}
}