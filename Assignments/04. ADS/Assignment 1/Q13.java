import java.util.*;

class Q13{
	public static void main(String args[]){
		
		Set<String> set = new TreeSet<>();
		Set<String> set1 = new TreeSet<>();
		
		set.add("Zara");
		set.add("Aman");
		set.add("Neha");
		System.out.println("\n"+set);
		
		System.out.println(set.remove("Neha"));
		System.out.println(set);
		
		
		set1.add("Meera");
		set1.add("meera");
		set1.add("Arjun");
		set1.add("Arjun");
		System.out.println("\n"+set1);
		System.out.println(set1.remove("Rahul"));
		System.out.println(set1.remove("Meera"));
		System.out.println(set1);
	}
}