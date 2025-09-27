import java.util.*;

class Q14{
	public static void main(String args[]){
		
		Map<Integer, String> map = new HashMap<>();
		Map<Integer, String> map1 = new HashMap<>();
		
		// map.put(205, "Refactoring");
		// map.put(101, "Clean_Code");
		// map.put(150, "Effective_Java");
		// System.out.println("\n"+map);
		
		map1.put(1, "Alpha");
		map1.put(2, "Beta");
		
		boolean updated = false;
		if(map1.containsKey(2)){
			map1.put(2, "Beta_2nd_Ed");
			updated = true;
		}
		System.out.println(updated);
		System.out.println(map1.remove(1, "Alpha"));
		System.out.println(map1);
	}
}