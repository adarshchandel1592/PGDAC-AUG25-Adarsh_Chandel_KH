class Staff {
    private String name;
    private double salary;

    Staff(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSal(double sal){
        this.salary = sal;
    }
}

class TeachingStaff extends Staff {
    private String subject;

    TeachingStaff(String name, String subject, double salary){
        super(name, salary);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String sub){
        this.subject = sub;
    }
}

class NonTeachingStaff extends Staff {
    private String department;

    NonTeachingStaff(String name, String department, double salary){
        super(name, salary);
        this.department = department;
    }

    public String getDept(){
        return department;
    }

    public void setDept(String dept){
        this.department = dept;
    }
}

class Que10 {
    public static void main(String args[]){
        TeachingStaff ts = new TeachingStaff("Anita", "Math", 50000);
        NonTeachingStaff nts = new NonTeachingStaff("Ramesh", "Admin", 40000);

        System.out.println("\n"+ts.getName() + " ----> " + ts.getSubject() + ", " + ts.getSalary());
        System.out.println(nts.getName() + " ----> " + nts.getDept() + ", " + nts.getSalary());
    }
}
