class A{
	String name;
	final static double pi = 3.14;
	A(String name){
		this.name = name;
	}
	void display(){
		System.out.println("Class A, "+ name);
	}
}

class FinalConstructor2{
		
	public static void main(String args[]){
		
		
		final A a = new A("Arsh"); // instance
		a.display();
		System.out.println(A.pi);
	}
}