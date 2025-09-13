import java.util.*;

class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return name +":"+ salary;
	}
	
	public int compareTo(Employee that){
		return this.salary - that.salary;
	}
}

class Que27{
	public static void main(String args[]){
		
		Set<Employee> s = new HashSet<Employee>();
		s.add(new Employee("Amit", 50000));
		s.add(new Employee("Priya",  60000));
		s.add(new Employee("Rohan",  45000));
		
		System.out.print("\nSorted by salary: ");
		for(Object i : s){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}