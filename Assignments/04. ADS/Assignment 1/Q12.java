import java.util.*;

class Q12{
	public static void main(String args[]){
		
		Set<String> set = new HashSet<>();
		
		set.add("A");
		set.add("A");
		set.add("B");
		System.out.println("\n"+set);
		
		System.out.println(set.contains("A"));
		System.out.println(set.contains("C"));
	}
}