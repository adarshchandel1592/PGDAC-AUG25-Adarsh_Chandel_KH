class BankAccount{
	private double balance;
	private String accountHolder;
	
	BankAccount(String accname, double accbal){
		this.accountHolder = accname;
		this.balance = accbal;
	}
	
	public String getName(){
		return accountHolder;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName(String name){
		this.accountHolder = name;
	}
	
	public void setBal(double balance){
		this.balance = balance;
	}
	
	public void printAcconutDetails() {
        System.out.print("\nAccount Holder Name: "+this.accountHolder+", Balance: "+this.balance);
    }
}

class Que12{
	public static void main(String args[]){
		BankAccount b1 = new BankAccount("Adarsh", 70000.25);
		
		b1.printAcconutDetails();
		System.out.println();
		
	}
}