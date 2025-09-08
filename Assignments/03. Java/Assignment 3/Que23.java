class Member{
	private String name;
	private int id;
	
	Member(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public void displayInfo(){
		System.out.println("\n"+getName()+" ---> ID = "+getID());
	}
}

class Teacher extends Member{
	private String subject;
	
	Teacher(String name, int id, String subject){
		super(name, id);
		this.subject = subject;
	}
	
	public String getSub(){
		return subject;
    }
	
    public void setSub(String sub){
    	this.subject = sub;
    }
	
	public void displayInfo(){
		System.out.println("\n"+getName()+" ---> ID = "+getID()+", Subject = "+getSub());
	}
}

class Student extends Member{
	private int grade;
	
	Student(String name, int id, int grade){
		super(name, id);
		this.grade = grade;
	}
	
	public int getGrade(){
		return grade;
    }
	
    public void setGrade(int grade){
    	this.grade = grade;
    }
	
	public void displayInfo(){
		System.out.println(getName()+" ---> ID = "+getID()+", Subject = "+getGrade());
	}
}

class Staff extends Member{
	private String department;
	
	Staff(String name, int id, String department){
		super(name, id);
		this.department = department;
	}
	
	public String getDept(){
		return department;
    }
	
    public void setDept(String department){
    	this.department = department;
    }
	
	public void displayInfo(){
		System.out.println(getName()+" ---> ID = "+getID()+", Subject = "+getDept());
	}
}

class Que23{
	public static void main(String args[]){
		
		Member t = new Teacher("Mr. Kumar", 101, "English");
		Member s = new Student("Riya", 201, 10);
		Member st = new Staff("Mr. Das", 301, "Maintenance");
		
		t.displayInfo();
		s.displayInfo();
		st.displayInfo();
		
	}
}
