class A{
	final int x = 100; //constant ban gaya: Compile time constant
	
	void display(){
		x = 200;
		System.out.print(x);
	}
}

public class Final2{
		
	public static void main(String args[]){
		
		
		A a = new A(); // instance
		a.display();
		
		
	}
}