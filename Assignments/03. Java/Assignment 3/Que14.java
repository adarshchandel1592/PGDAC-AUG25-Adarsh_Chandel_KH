abstract class Employee{
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	abstract public void calculateBonus();
}

class Manager extends Employee{
	Manager(String name, double salary){
		super(name, salary);
	}
	
	public void calculateBonus(){
		
		double bonus = salary * 0.2;
		System.out.println("\n"+name+", Bonus = "+bonus);
	}
}

class Developer extends Employee{
	Developer(String name, double salary){
		super(name, salary);
	}
	
	public void calculateBonus(){
		double bonus = salary * 0.1;
		System.out.print(name+", Bonus = "+bonus);
	}
}

class Que14{
	public static void main(String args[]){
		
		Employee m = new Manager("Anita", 50000);
		Employee d = new Developer("Rohit", 40000);
		
		m.calculateBonus();
		d.calculateBonus();
		System.out.println();
	}
}
