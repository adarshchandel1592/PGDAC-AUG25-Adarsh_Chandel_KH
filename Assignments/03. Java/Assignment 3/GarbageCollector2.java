class A{
	int x;
	{System.out.println();}
	
	A(int x){
		this.x = x;
		System.out.println("Instane created " + x);
	}
}

class GarbageCollector2{
	
	public static void main(String args[]){
		
		A a1 = new A(5);
		A a2 = new A(10);
		A a3 = new A(20);
		System.out.println();
		System.out.println("2. Re-assignning of references");
		a3 = a2;
		a2 = a1;
		
		System.gc();    // Request for GC
		System.out.println(a1.x);
		System.out.println("Null references are collected by finalize");
	}
}