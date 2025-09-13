import java.util.*;

class Que24{
	
	public static void main(String args[]){
		
		Queue<String> q = new PriorityQueue<>();
		
		q.offer("Doc1");
		q.offer("Doc2");
		q.offer("Doc3");
		
		
		System.out.println();
		System.out.println("Jobs: "+q);
		System.out.println("Process: 1 job");
		
		System.out.println("--------------------------------");
		
		
		System.out.println("Printing: "+q.poll()+", Queue: "+q);
		
		
	}
}