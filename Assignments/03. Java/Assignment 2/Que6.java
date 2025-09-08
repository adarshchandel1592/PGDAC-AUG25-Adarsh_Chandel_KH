class Passenger{
	String name;
	String seatType = "General";
	int age;
	static int counter;
	
	Passenger(String passname, int passage){
		this.name = passname;
		this.age = passage;
		counter++;
	}
	
	Passenger(String passName, int passAge, String passseatType){
		this.name = passName;
		this.age = passAge;
		this.seatType = passseatType;
		counter++;
	}
}

class Que6{
	public static void main(String args[]){
		Passenger p1 = new Passenger("Ravi", 25);
		Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
		Passenger p3 = new Passenger("Suresh", 40);
		
		System.out.print("\nPassenger1: Name: "+p1.name+" ,Age: "+p1.age+", Seat: "+p1.seatType);
		System.out.print("\nPassenger1: Name: "+p2.name+" ,Age: "+p2.age+", Seat: "+p2.seatType);
		System.out.print("\nPassenger1: Name: "+p3.name+" ,Age: "+p3.age+", Seat: "+p3.seatType);
		System.out.print("\nTotal Passengers Booked: "+Passenger.counter);
		System.out.println();
	}
}