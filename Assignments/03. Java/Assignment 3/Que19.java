class BankAccount{
	private int accountNumber;
	private	String accountHolder;
	private double balance;
	
	BankAccount(int accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayBalance(){
		System.out.println("\nAccount Number: "+getAccountNumber()+", Name: "+getAccountHolder()+" ---> Balance = "+getBalance());
	}
}

class SavingsAccount extends BankAccount{
	private double interestRate;
	
	SavingsAccount(int accountNumber, String accountHolder, double balance, double IR){
		super(accountNumber, accountHolder, balance);
		this.interestRate = IR;
	}
	
	public double getIR() {
		return interestRate;
	}

	public void setIR(double IR) {
		this.interestRate = IR;
	}
	
	public void calculateInterest(){
		double ir = getBalance() * ((getIR()) / 100);
		System.out.println("\n"+getAccountHolder()+" ---> Balance = "+getBalance()+", Interest = "+ir);
	}
}

class CurrentAccount extends BankAccount{
	private double overdraftLimit;
	
	CurrentAccount(int accountNumber, String accountHolder, double balance, double OL){
		super(accountNumber, accountHolder, balance);
		this.overdraftLimit = OL;
	}
	
	public double getOL() {
		return overdraftLimit;
	}

	public void setOL(double OL) {
		this.overdraftLimit = OL;
	}
	
	public void checkOverdraft(){
		System.out.println(getAccountHolder()+" ---> Balance = "+getBalance()+", Overdraft Limit = "+getOL());
	}
} 

class Que19{
	public static void main(String args[]){
		
		SavingsAccount s = new SavingsAccount(101, "Ramesh", 5000, 5);
		CurrentAccount c = new CurrentAccount(102, "Anita", 2000, 2000);
		
		s.calculateInterest();
		c.checkOverdraft();
		System.out.println();
	}
}

