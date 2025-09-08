class A{
	final int x = 100; //constant ban gaya: Compile time constant
}

public class Finalkeyword{
	final static int y = 200;
	final int z = 300;
	
	public static void main(String args[]){
		
		int m = 400;
		final int n = 1000; //compile time constant
		A a = new A(); // instance
		Finalkeyword f = new Finalkeyword();
		
		System.out.println("\n"+a.x); //instance variable of class A
		System.out.println(y); //static variable
		System.out.println(f.z); //instance variable
		System.out.println(m); //local variable
		System.out.println(n); //local variable
		System.out.println("-------------------------------------\n");
		
		m = 500;
		n = 12324;
		System.out.println(m); //local variable
		System.out.println(n); //local variable
		System.out.println("-------------------------------------\n");
		
		a.x = 2000;
		System.out.println(a.x);
		System.out.println("-------------------------------------\n");
		
		
	}
}