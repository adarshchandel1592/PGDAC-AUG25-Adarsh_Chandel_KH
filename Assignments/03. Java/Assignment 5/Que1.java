import java.util.*;

class Que1{
	
	public static void main(String args[]){
		
		List<String> list = new ArrayList<>();
		
		list.add("Amit");
		list.add("Priya");
		list.add("Rohan");
		
		for(String i : list){
			System.out.println(i);
		}
		
		list.remove(1);
		System.out.println("Students: "+list);
		
	}
}