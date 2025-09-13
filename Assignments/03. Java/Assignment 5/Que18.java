import java.util.*;

class Que18{
	public static void main(String args[]){
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.add("Amit");
		list1.add("Priya");
		list2.add("Rohan");
		list2.add("Priya");
		
		System.out.println("Morning Batch: "+list1);
		System.out.println("Evening Batch: "+list2);
		
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println("Combined batches: "+list1);
	}
}