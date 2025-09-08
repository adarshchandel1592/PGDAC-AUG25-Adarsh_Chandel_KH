class Account{
    private int accountNo;
    private double balance;
		
    Account(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getAccNo(){
        return accountNo;
    }

    public void setAccNo(int acc){
        this.accountNo = acc;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double bal){
        this.balance = bal;
    }
}

class SavingAccount extends Account{
    private double interestRate;

   SavingAccount(int accountNo, double balance, double interestRate){
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public double getIR(){
        return interestRate;
    }

    public void setIR(double ir){
        this.interestRate = ir;
    }
}

class CurrentAccount extends Account{
    private double overdraftLimit;

   CurrentAccount(int accountNo, double balance, double overdraftLimit){
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOL(){
        return overdraftLimit;
    }

    public void setOL(double ol){
        this.overdraftLimit = ol;
    }
}

class Que11 {
    public static void main(String args[]){
        SavingAccount s = new SavingAccount(101, 5000, 5);
        CurrentAccount c = new CurrentAccount(102, 10000, 2000);

        System.out.println("\nSaving ----> "+s.getAccNo() + ", Balance = " + s.getBalance() + ", Interest = " + s.getIR()+"%");
         System.out.println("Current ----> "+c.getAccNo() + ", Balance = " + c.getBalance() + ", Overdraft = " + c.getOL());
    }
}
