class Customer{
	String name, ticketType = "Normal";
	static int counter;
	
	Customer(String custName){
		this.name = custName;
		counter++;
	}
	
	Customer(String custName1, String ticket){
		this.name = custName1;
		this.ticketType = ticket;
		counter++;
	}
}

class Que7{
	public static void main(String args[]){
		Customer c1 = new Customer("Rahul");
		Customer c2 = new Customer("Pooja", "Premium");
		Customer c3 = new Customer("Amit");
		
		System.out.print("\nCustomer1: Name: "+c1.name+", Ticket: "+c1.ticketType);
		System.out.print("\nCustomer2: Name: "+c2.name+", Ticket: "+c2.ticketType);
		System.out.print("\nCustomer3: Name: "+c3.name+", Ticket: "+c3.ticketType);
		System.out.print("\nTotal Tickets Sold: "+Customer.counter);
		System.out.println();
	}
}

