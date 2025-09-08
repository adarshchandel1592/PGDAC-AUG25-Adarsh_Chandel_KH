class A{
	int a;
	{System.out.println();}
	
	A(int x){
		this.a = x;
		System.out.println("Instane created " + a);
	}
}

class GarbageCollector3{
	
	public static void main(String args[]){
		
		A a1 = new A(5);
		A a2 = new A(10);
		A a3 = new A(20);
		System.out.println();
		System.out.println("3. Island of Isolation");
		a1.a = a3;
		a3.a = a2;
		a2.a = a1;
		
		a1 = a2 = a3 = null;
		
		System.gc();    // Request for GC
		System.out.println("Null references are collected by finalize");
	}
}