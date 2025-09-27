import java.util.*;

class Q11{
	public static void main(String args[]){
		
		List<String> ll = new LinkedList<>();
		List<String> ll1 = new LinkedList<>();
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.remove(0);
		System.out.println("\n"+ll);
		
		ll1.add("A");
		ll1.add("B");
		ll1.add("C");
		ll1.set(1, "X");
		System.out.println("\n"+ll1);
	}
}