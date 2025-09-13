import java.util.*;

class Que22{
	
	public static void main(String args[]){
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("Amit");
		q.offer("Priya");
		q.offer("Rohan");
		
		
		System.out.println(q);
		System.out.println("Queue: "+q);
		System.out.println("Serve: 1 customer");
		
		System.out.println("--------------------------------");
		
		
		System.out.println("Serving: "+q.poll()+", Queue: "+q);
		
		
	}
}