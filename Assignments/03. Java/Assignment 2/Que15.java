class Employee{
	private String name;
	private int id;
	private double basicSalary;
	static int counter = 1001;
	
	Employee(){
		this.id = counter++;
		this.name = "Unknown";
		this.basicSalary = 20000;
	}
	
	Employee(String empname, double empsalary){
		this.id = counter++;
		this.name = empname;
		this.basicSalary = empsalary;
	}
	
	public int getEmpID(){
		return id;
	}
	
	public String getEmpName(){
		return name;
	}
	
	public double getEmpSalary(){
		return basicSalary;
	}
	
}

class Que15{
	public static void main(String args[]){
		Employee e1 = new Employee();
		Employee e2 = new Employee("Arsh", 61000);
		Employee e3 = new Employee("Ansh", 85000);
		
		System.out.println();
		System.out.println("ID: "+e1.getEmpID()+", Name: "+e1.getEmpName()+", Basic Salary: "+e1.getEmpSalary());
		System.out.println("ID: "+e2.getEmpID()+", Name: "+e2.getEmpName()+", Basic Salary: "+e2.getEmpSalary());
		System.out.println("ID: "+e3.getEmpID()+", Name: "+e3.getEmpName()+", Basic Salary: "+e3.getEmpSalary());
		System.out.println();
	}
}