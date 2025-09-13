import java.util.*;

class Que19{
	public static void main(String args[]){
		
		Map<String, Integer> mp = new TreeMap<>();
		
		mp.put("Amit", 85);
		mp.put("Priya", 92);
		
		Iterator<Map.Entry<String, Integer>> i = mp.entrySet().iterator();
		System.out.print("Grade Report: ");
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
	}
}