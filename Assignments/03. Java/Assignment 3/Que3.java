import java.util.Scanner;

class Employee{
	private int age;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		if(age>=18){
			this.age = age;
			System.out.print("\nValid Age");
		}
		else{
			System.out.print("\nInvalid Age");
		}
	}
}

class Que3{
	public static void main(String args[]){
		
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nAge = ");
		int age = sc.nextInt();
		
		e.setAge(age);
		System.out.println();
	}
}