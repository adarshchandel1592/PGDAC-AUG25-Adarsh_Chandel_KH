import java.util.*;

class Que20{
	public static void main(String args[]){
		
		List<Integer> list = new ArrayList<>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		
		System.out.println("\nRoll numbers: "+list);
		System.out.print("Even Roll Numbers: ");
		for(int i = 0; i<list.size(); i++){
			if (list.get(i) % 2 == 0){
				System.out.print(list.get(i)+" ");
			}
		}
		System.out.println();
	}
}