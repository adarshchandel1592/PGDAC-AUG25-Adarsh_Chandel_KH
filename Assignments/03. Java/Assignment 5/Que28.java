import java.util.*;

class Que28{
	public static void main(String args[]){
		
		Map<String, List<String>> mp = new LinkedHashMap<>();
		mp.put("IT", Arrays.asList("Amit", "Rohan"));
		mp.put("HR", Arrays.asList("Priya"));
		
		System.out.print("\nDepartemnt Structure: ");
		for(Map.Entry<String, List<String>> i : mp.entrySet()){
			String dept = i.getKey();
			List<String> list = i.getValue();
			System.out.print(dept+": "+String.join(", ", list)+"; ");
		}
	}
}