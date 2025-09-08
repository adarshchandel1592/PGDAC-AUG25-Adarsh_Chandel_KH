class A{
	
	final void display(){
		System.out.println("\nClass A");
	}
}

class B extends A{
	// final void display(){ //Error: Cannot override final method
		// System.out.println("Class B");
	// }
}
class C extends B{
	void display(){ //Error: Cannot override final method
		System.out.println("Class C");
	}
}

public class FinalMethod{
		
	public static void main(String args[]){
		
		
		A a = new A(); // instance
		a.display();
		// B b = new B(); // instance
		// b.display();
		
		
	}
}