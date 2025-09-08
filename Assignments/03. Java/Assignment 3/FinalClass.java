final class A{
	
	void display(){
		System.out.println("\nClass A");
	}
}

// class B extends A{

// }

public class FinalClass{
		
	public static void main(String args[]){
		
		
		A a = new A(); // instance
		a.display();
	}
}