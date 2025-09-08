class A{
	int x;
	{System.out.println();}
	
	A(int x){
		this.x = x;
		System.out.println("Instane created " + x);
	}
}

class GarbageCollector{
	
	public static void main(String args[]){
		
		A a1 = new A(5);
		A a2 = new A(10);
		System.out.println();
		System.out.println("1. Nulling an object");
		a1 = null;
		a2 = null;
		
		System.gc();    // Request for GC
		System.out.println(a1.x); // Error dega. Null pointer exception.
		System.out.println("Null references are collected by finalize");
	}
	
	// protected void finalize(){
		// System.out.println("Null references are collected by finalize");
	}