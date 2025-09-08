interface BonusEligible{
	void calculateBonus();
}

abstract class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
	
    public abstract void calculateSalary();
}

class PermanentEmployee extends Employee implements BonusEligible{
	private double basicSalary, hra;
	
	PermanentEmployee(String name, int id, double basicSalary, double hra){
		super(name, id);
		this.basicSalary = basicSalary;
		this.hra = hra;
	}
	
	// Getter for basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Setter for basicSalary
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter for hra
    public double getHra() {
        return hra;
    }

    // Setter for hra
    public void setHra(double hra) {
        this.hra = hra;
    }
	
	public void calculateSalary(){
		basicSalary += hra;
	}
	
	public void calculateBonus(){
		calculateSalary();
		System.out.println("\n"+name+", Salary = "+basicSalary+ ", Bonus = "+basicSalary*0.10);
	}
}

class ContractEmployee extends Employee{
	private double hourlyRate, hoursWorked;
	
	ContractEmployee(String name, int id, double hourlyRate, double hoursWorked){
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	 // Getter for hourlyRate
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setter for hourlyRate
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Getter for hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Setter for hoursWorked
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
	
	public void calculateSalary(){
		System.out.println("\n"+name+", Salary = "+getHourlyRate() * getHoursWorked());
	}
}

class Que29{
	public static void main(String args[]){
		
		PermanentEmployee p = new PermanentEmployee("Amit", 101, 50000, 5000);
		p.calculateBonus();
		
		ContractEmployee c = new ContractEmployee("Neha", 102, 300, 100);
		c.calculateSalary();
		
	}
}