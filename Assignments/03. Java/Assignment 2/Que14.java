class BankAccount{
	private double balance;
	private String accountHolder;
	static String bankName = "CDAC Bank";
	
	public static void displayBankName(){
		System.out.println("\nAll the transactions took place in "+bankName);
	}
	
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
	
	public void deposit(double amount){
		balance += amount;
		System.out.println("\n"+amount+" is deposited to "+this.accountHolder+"'s account. New balance: "+balance);
	}
	
	public void withdraw(double amount){
		if(amount>0 && amount<=balance){
			balance -= amount;
			System.out.println("\n"+amount+" is withdrawn from "+this.accountHolder+"'s account. New balance: "+balance);
		}
		else{
			System.out.println("Insufficient funds.....");
		}
	}
	
	public void printAcconutDetails() {
		System.out.println("\nInitial Account Details");
        System.out.print("\nAccount Holder Name: "+this.accountHolder+", Balance: "+this.balance+", Bank Name: "+this.bankName);
    }
}

class Que14{
	public static void main(String args[]){
		BankAccount b1 = new BankAccount("Adarsh", 70000.25);
		
		b1.printAcconutDetails();
		System.out.println();
		
		System.out.println("\nUpdated Account Details after Deposit and Withdrawl");
		b1.deposit(3000);
		b1.withdraw(8000);
		BankAccount.displayBankName();
	}
}