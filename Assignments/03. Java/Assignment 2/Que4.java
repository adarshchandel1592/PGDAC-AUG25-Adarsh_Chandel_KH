class Employee{
	private String name;
	private double salary;
	private int yearsOfService;
	static int totalEmployees;
	
	Employee(String empname, double empsal, int empyear){
		this.name = empname;
		this.salary = empsal;
		this.yearsOfService = empyear;
		totalEmployees++;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSal(){
		return salary;
	}
	
	public int getYear(){
		return yearsOfService;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setSal(double salary){
		this.salary = salary;
	}
	
	public void setServYear(int year){
		this.yearsOfService=year;
	}
	
	public double calculateBonus(){
		double bonus=0;
		if(yearsOfService>5){
			bonus=salary*0.05;
		}
		else{
			bonus=0;
		}
		return bonus;
	}
	
	public static int showTotalEmployees(){
		return totalEmployees;
	}
}

class Que4{
	public static void main(String args[]){
		Employee e1 = new Employee("Ravi", 150000, 6);
		Employee e2 = new Employee("Anita", 120000, 3);
		Employee e3 = new Employee("Suresh", 100000, 5);
		
		System.out.print("\nEmployee "+e1.getName()+" Bonus: "+e1.calculateBonus());
		System.out.print("\nEmployee "+e2.getName()+" Bonus: "+e2.calculateBonus());
		System.out.print("\nEmployee "+e3.getName()+" Bonus: "+e3.calculateBonus());
		System.out.print("\nTotal Employees: "+Employee.totalEmployees);
		System.out.println();
	}
}