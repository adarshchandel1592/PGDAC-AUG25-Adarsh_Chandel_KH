class Student{
	private String name, className;
	static int tuitionFee;
	
	static{
		tuitionFee=30000;
		System.out.print("\nSchool Tuition Fee Initialized: "+tuitionFee); 
	}
	
	Student(String Studname, String Class){
		this.name = Studname;
		this.className = Class;
	}
	
	public String getName(){
		return name;
	}
	
	public String getClassName(){
		return className;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setClassName(String className){
		this.className = className;
	}
}

class Que9{
	public static void main(String args[]){
		Student s1 = new Student("Anjali", "10th");
		Student s2 = new Student("Vikram", "12th");
		
		System.out.print("\nStudent1: Name="+s1.getName()+", Class="+s1.getClassName()+", Tuition Fee="+Student.tuitionFee);
		System.out.print("\nStudent2: Name="+s2.getName()+", Class="+s2.getClassName()+", Tuition Fee="+Student.tuitionFee);
		System.out.println();
	}
}