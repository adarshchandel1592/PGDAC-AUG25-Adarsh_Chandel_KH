import java.util.*;

class Q15{
	public static void main(String args[]){
		
		Map<String, String> map = new LinkedHashMap<>();
		Map<String, String> map1 = new LinkedHashMap<>();
		
		map.put("alice", "a1");
		map.put("bob", "b1");
		boolean updated = false;
		if(map.containsKey("alice")){
			map.put("alice", "a2");
			updated = true;
		}
		System.out.println("\n"+updated);
		System.out.println(map);
		
		map.put("carol", "c1");
		System.out.println("\n"+map.remove("bob","b1"));
		map.put("bob", "b2");
		System.out.println(map);
	}
}