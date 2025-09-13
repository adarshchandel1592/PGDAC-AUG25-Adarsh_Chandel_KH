import java.util.*;

class Que4{
	public static void main(String[] args){
		
		List<String> list = new ArrayList<>();
		
		list.add("Milk");
		list.add("Eggs");
		list.add("Bread");
		
		list.remove(0);
		
		System.out.println();
		System.out.println("Items to buy: "+list);
		System.out.println();
	}
}