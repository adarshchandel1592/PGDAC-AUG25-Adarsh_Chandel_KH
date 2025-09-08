interface Payment{
	public void pay();
}

class CreditCardPayment implements Payment{
	private double amount;
	
	CreditCardPayment(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public void pay(){
		System.out.println("\nProcessing Credit Card Payment of "+getAmount());
	}
}

class PayPalPayment implements Payment{
	private double amount;
	
	PayPalPayment(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public void pay(){
		System.out.println("\nProcessing Pay Pal Payment of "+getAmount());
	}
}

class Que24{
	public static void main(String args[]){
		CreditCardPayment c = new CreditCardPayment(2500);
		PayPalPayment p = new PayPalPayment(1500);
		c.pay();
		p.pay();
		System.out.println();
	}
}