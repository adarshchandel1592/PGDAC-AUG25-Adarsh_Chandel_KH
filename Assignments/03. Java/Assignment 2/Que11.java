class Student{
	private int rollno;
	private double marks;
	private String name;
	private String grade;
	
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
	
	public String calculateGrade(){
		if(this.marks>=80){
			grade = "A";
		}
		else if(this.marks>=60){
			grade = "B";
		}
		else if(this.marks>=40){
			grade = "C";
		}
		else{
			grade = "Fail";
		}
		return grade;
	}
	
	public void printStudentDetails() {
		calculateGrade();
        System.out.print("\nName: " + this.rollno+", Marks: "+this.marks+", Grade: "+this.grade);
		System.out.println();
    }
}

class Que11{
	public static void main(String args[]){
		Student s1 = new Student(1,"Adarsh",65.5);
		Student s2 = new Student(2,"Arindam",86);
		
		s1.printStudentDetails();
		s2.printStudentDetails();
		
		
	}
}