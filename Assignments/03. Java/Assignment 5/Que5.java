import java.util.*;

class Que5{
	public static void main(String[] args){
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("Java");
		q.offer("Python");
		q.offer("C++");
		q.offer("DSA");
		q.offer("OOP");
		q.offer("Spring");
		
		System.out.println();
		q.poll();
		System.out.println("Recent Searches: "+q);
		System.out.println();
	}
}