class Student{
	private int rollno;
	private double marks;
	private String name;
	
	Student(int roll, String studname, double studmarks){
		this.rollno = roll;
		this.name = studname;
		this.marks = studmarks;
	}
	
	public int getRoll(){
		return rollno;
	}
	
	public String getName(){
		return name;
	}
	
	public double getMarks(){
		return marks;
	}
	
	public void setRoll(int rollno){
		this.rollno = rollno;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setMarks(double marks){
		this.marks = marks;
	}
	
	public void printStudentDetails() {
        System.out.print("\nRoll No: " + this.rollno);
        System.out.print("\nName: " + this.name);
        System.out.print("\nMarks: " + this.marks);
    }
}

class Que10{
	public static void main(String args[]){
		Student s1 = new Student(1,"Adarsh",65.5);
		Student s2 = new Student(2,"Arindam",86);
		
		System.out.print("\nInitial Student Details\n");
		s1.printStudentDetails();
		System.out.println();
		s2.printStudentDetails();
		System.out.println();
		
		s1.setMarks(90);
		s2.setMarks(95);
		
		
		System.out.print("\n\nUpdated Student Details\n");
		s1.printStudentDetails();
		System.out.println();
		s2.printStudentDetails();
		
	}
}