class A{
	final int x; //constant ban gaya: Compile time constant
	
	A(int x){ //A final variable can be initialised in a constructor, but only once
		this.x = x;
	}
	void display(){
		System.out.println(x);
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