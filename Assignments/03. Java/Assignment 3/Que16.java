class Employee{
	private String name;
	private double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSal(){
		return salary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setSal(double sal){
		this.salary = sal;
	}
	
	public void displaySalary(){
		System.out.println("\n"+name+", Total Salary = "+salary);
	}
}

class Manager extends Employee{
	Manager(String name, double salary){
		super(name, salary);
	}
	
	public void displaySalary(){
		double bonusSalary = getSal() + getSal()*0.2;
		System.out.println("\n"+getName()+", Total Salary = "+bonusSalary);
	}
}

class Developer extends Employee{
	Developer(String name, double salary){
		super(name, salary);
	}
	
	public void displaySalary(){
		double bonusSalary = getSal() + getSal()*0.1;
		System.out.println(getName()+", Total Salary = "+bonusSalary);
	}
}

class Que16{
	public static void main(String args[]){
		
		Employee m = new Manager("Anita", 50000);
		Employee d = new Developer("Rohit", 40000);
		
		m.displaySalary();
		d.displaySalary();
	}
}