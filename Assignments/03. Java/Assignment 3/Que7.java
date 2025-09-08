abstract class Employee{
	String name;
	double basicSalary;
	
	Employee(String name, double basicSalary){
		this.name = name;
		this.basicSalary = basicSalary;
	}
}

class RegularEmployee extends Employee{
	RegularEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}
	
	public double netSal(){
		basicSalary += basicSalary*0.1;
		return basicSalary;
	}
}

class ContractEmployee extends Employee{
	ContractEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}
	
	public double netSal(){
		basicSalary += basicSalary*0.05;
		return basicSalary;
	}
}

class Que7{
	public static void main(String args[]){
		RegularEmployee r = new RegularEmployee("Rahul", 20000);
		ContractEmployee c = new ContractEmployee("Riya", 15000);
		
		System.out.print("\n"+r.name+" Net Salary = "+r.netSal());
		System.out.print("\n"+c.name+" Net Salary = "+c.netSal());
		System.out.println();
		
		
		//Executed in one go...............
	}
}