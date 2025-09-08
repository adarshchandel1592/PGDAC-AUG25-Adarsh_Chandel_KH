abstract class Payment{
	abstract void pay();
}

class CreditCardPayment extends Payment{
	private long cardNumber;
	private double amount;
	
	CreditCardPayment(long cardno, double amount){
		this.cardNumber = cardno;
		this.amount = amount;
	}
	
	public long getCardNo(){
		return cardNumber;
	}
	
	public void setCardNo(long cn){
		this.cardNumber = cn;
	}
	
	public double getCreditAmount(){
		return amount;
	}
	
	public void setCreditAmount(double amount){
		this.amount = amount;
	}
	
	public void pay(){
		System.out.print("\nPayment via Credit Card "+cardNumber+" ---> Rs. "+amount+" Paid");
	}
}

class UPIPayment extends Payment{
	private String upiID;
	private double amount;
	
	UPIPayment(String upiID, double amount){
		this.upiID = upiID;
		this.amount = amount;
	}
	
	public String getUPI(){
		return upiID;
	}
	
	public void setUPI(String upi){
		this.upiID = upi;	
	}
	
	public double getUPIAmount(){
		return amount;
	}
	
	public void setUPIAmount(double amount){
		this.amount = amount;
	}

	public void pay(){
		System.out.print("\nPayment via UPI "+upiID+" ---> Rs. "+amount+" Paid");
	}
}

class Que18{
	public static void main(String args[]){
		
		Payment p;
		
		p = new CreditCardPayment(1234567890123456L, 5000);
		p.pay();
		
		p = new UPIPayment("rahul@upi", 2000);
		p.pay();
		
		System.out.println();
	}
}