class Student{
	private String name;
	private int marks;
	static int totalStudents;
	
	Student(String studname, int studmarks){
		this.name = studname;
		this.marks = studmarks;
		totalStudents++;
	}
	
	public String getName(){
		return name;
	}
	
	public int getMarks(){
		return marks;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setMarks(int marks){
		this.marks = marks;
	}
	
	public boolean isPassed(){
		if(marks>=35){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int showTotalStudents(){
		return totalStudents;
	}
}

class Que5{
	public static void main(String args[]){
		Student s1 = new Student("Rahul", 78);
		Student s2 = new Student("Pooja", 34);
		Student s3 = new Student("Amit", 65);
		
		System.out.print("\nStudent "+s1.getName()+" Passed? "+s1.isPassed());
		System.out.print("\nStudent "+s2.getName()+" Passed? "+s2.isPassed());
		System.out.print("\nStudent "+s3.getName()+" Passed? "+s3.isPassed());
		System.out.print("\nTotal students: "+Student.totalStudents);
		System.out.println();
	}
}