import java.util.*;

class Student{
	private String name, grade;
	
	Student(String name, String grade){
		this.name = name;
		this.grade = grade;
	}
	
	public String toString(){
		return name +":"+ grade;
	}
}

class Que29{
	public static void main(String args[]){
		
		Collection<Student> c = new ArrayList<>();
		c.add(new Student("Amit", "A"));
		c.add(new Student("Priya", "B"));
		System.out.print("\nStudent Records: ");
		for(Object i : c){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}