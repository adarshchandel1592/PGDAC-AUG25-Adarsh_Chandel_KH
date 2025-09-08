                               class Ticket{
	private String passengerName;
	private int ticketNo;
	static int ticketcounter = 5001;
	
	Ticket(String name){
		this.ticketNo=ticketcounter;
		this.passengerName=name;
		ticketcounter++;
	}
	
	public String getNamw(){
		return passengerName;
	}
	
	public void displayTicket(){
		System.out.println("Ticket No: "+ticketNo+", Passenger: "+this.passengerName);
	}
}

class Que20{
	public static void main(String args[]){
		Ticket t1 = new Ticket("Rahul");
		Ticket t2 = new Ticket("Priya");
		Ticket t3 = new Ticket("Amit");
		System.out.println();
		
		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();
	}
}