import java.util.*;

class Que16{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> mp = new LinkedHashMap<>();
		
		mp.put("Amit", 85);
		mp.put("Priya", 52);
		mp.put("Rohan", 78);
		
		System.out.print("\nFilter Threshold: ");
		int thres = sc.nextInt();
		
		Iterator<Map.Entry<String, Integer>> itr = mp.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, Integer> ref = itr.next();
			if(ref.getValue() < thres){
				itr.remove();
			}
		}
		
		System.out.println("\nFiltered Map:");
        for (Map.Entry<String, Integer> i : mp.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
		
	}
}