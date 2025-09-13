import java.util.*;


class Student{
	int roll;
	String name, dept;
	double cgpa;
	
	Student(int roll, String name, String dept, double cgpa){
		this.roll = roll;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}

	public String toString(){
		return roll+", "+name+", "+dept+", "+cgpa;
	}

	public String getName(){
		return name;
	}
}


public class USMS {

	public static void main(String[] args) {

		
		Student s1 = new Student(101, "Amit", "CS", 8.5);
		Student s2 = new Student(102, "Priya", "Math", 9.2);
		Student s3 = new Student(103, "Rohan", "CS", 7.8);
		Student s4 = new Student(104, "Sneha", "Physics", 4.5);

		//1. Registration Details
		List<Student> reglist = new ArrayList<>();
		reglist.add(s1);
		reglist.add(s2);
		reglist.add(s3);
		reglist.add(s4);

		System.out.print("\nRegistration Order: ");
		for (int i = 0; i < reglist.size(); i++) {
			System.out.print(reglist.get(i).name);
			if(i < reglist.size() - 1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}