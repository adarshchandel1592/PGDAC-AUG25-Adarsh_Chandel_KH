import java.util.*;

class Que2{
	public static void main(String args[]){
		
		Queue<String> q = new LinkedList<>();
		q.offer("Amit");
		q.offer("Priya");
		q.offer("Rohan");
		
		q.poll();
		System.out.println("\nQueue: "+q);
	}
}