import java.util.*;

class Que15{
	public static void main(String args[]){
		
		Map<String, Integer> mp = new HashMap<>();

		mp.put("Java", 3);
		mp.put("Python", 5);
		
		mp.put("Java", mp.get("Java") - 1);
		
		for(Map.Entry<String, Integer> i : mp.entrySet()){
			System.out.println(i.getKey()+": "+i.getValue());
		}
	}
}