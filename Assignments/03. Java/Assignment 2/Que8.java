class BankAccount{
	private String name;
	private double balance;
	static double rate;
	
	BankAccount(String AccName, double AccBal){
		this.name = AccName;
		this.balance = AccBal;
	}
	
	static{
		rate = 4.0;
		System.out.print("\nBank Interest Rate Initialised: "+rate+"%");
	}
	
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
}

class Que8{
	public static void main(String args[]){
		BankAccount b1 = new BankAccount("Rohit", 5000.0);
		BankAccount b2 = new BankAccount("Priya", 15000.0);
		
		System.out.print("\nAccount1: Name="+b1.getName()+", Balance="+b1.getBalance()+", Interest Rate="+BankAccount.rate+"%");
		System.out.print("\nAccount2: Name="+b1.getName()+", Balance="+b1.getBalance()+", Interest Rate="+BankAccount.rate+"%");
		System.out.println();
	}
}