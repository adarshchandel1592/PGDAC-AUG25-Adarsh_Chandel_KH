class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public void displaySalary() {
        System.out.println("\n" + getName() + " ---> Salary = " + getSalary());
    }
}

class TeachingStaff extends Employee {
    private String subject;

    TeachingStaff(String name, String subject, double salary) {
        super(name, salary);
        this.subject = subject;
    }

    public String getSub() {
        return subject;
    }

    public void setSub(String sub) {
        this.subject = sub;
    }

    public void displaySalary() {
        System.out.println("\n" + getName() + " ---> Subject = " + getSub() + ", Salary = " + getSalary());
    }
}

class Professor extends TeachingStaff {
    private String specialization;

    Professor(String name, String subject, String specialization, double salary) {
        super(name, subject, salary);
        this.specialization = specialization;
    }

    public String getSpec() {
        return specialization;
    }

    public void setSpec(String spec) {
        this.specialization = spec;
    }

    public void displaySalary() {
        System.out.println("\n" + getName() + " ---> Subject = " + getSub() +
                           ", Specialization = " + getSpec() + ", Salary = " + getSalary());
    }
}

class Lecturer extends TeachingStaff {
    private String department;

    Lecturer(String name, String subject, String department, double salary) {
        super(name, subject, salary);
        this.department = department;
    }

    public String getDept() {
        return department;
    }

    public void setDept(String dept) {
        this.department = dept;
    }

    public void displaySalary() {
        System.out.println("\n" + getName() + " ---> Subject = " + getSub() +
                           ", Department = " + getDept() + ", Salary = " + getSalary());
    }
}

public class Que20 {
    public static void main(String args[]) {
        Professor prof = new Professor("Dr. Sharma", "Math", "Algebra", 80000);
        Lecturer lect = new Lecturer("Ms. Mehta", "Physics", "Science", 50000);

        prof.displaySalary();
        lect.displaySalary();
    }
}
