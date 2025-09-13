import java.util.*;

class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public String toString() {
        return name + ":" + salary;
    }
}

class Que26 {
    public static void main(String args[]) {

        Collection<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Amit", 50000));
        emp.add(new Employee("Priya", 60000));

        System.out.print("\nEmployee List: ");
        for (Employee i : emp) {
            System.out.print(i+" ");
        }
		System.out.println();
    }
}
