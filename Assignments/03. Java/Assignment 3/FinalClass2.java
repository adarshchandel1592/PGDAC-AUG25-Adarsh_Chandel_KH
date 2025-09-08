class X{
	void display(){
		System.out.println("Class X");
	}
}

final class A extends X{
	void display(){
		System.out.println("Class A");
	}
}

public class FinalConstructor{
		
	public static void main(String args[]){
		
		
		A a = new A(120); // instance
		a.display();
		A a1 = new A(130); // instance
		a1.display();
		
		
	}
}