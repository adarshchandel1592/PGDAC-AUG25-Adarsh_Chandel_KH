import java.util.Scanner;

class BankAccount{
	private double balance;
	
	public double getBalance(){
		return this.balance;
	}
	
	public double deposit(double amount){
		balance+=amount;
		System.out.print("\nDeposit = " + amount);
		return balance;
	}
	
	public double withdraw(double amount){
		System.out.print("\nWithdraw = " + amount);
		if(amount>balance){
			System.out.println("\nWithdrawl amount is greater than Balance. Declined!!");
		}
		else{
			balance-=amount;
		}
		return balance;
	}
}

class Que1{
	public static void main(String args[]){
		
		BankAccount b = new BankAccount();
		
		b.deposit(5000);
		b.withdraw(12000);
		System.out.print("\nUpdated Balance = " + b.getBalance());
		System.out.println();
		
	}
}