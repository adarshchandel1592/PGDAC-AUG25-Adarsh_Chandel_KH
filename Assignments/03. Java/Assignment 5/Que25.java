import java.util.*;

class Que25{
	
	public static void main(String args[]){
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("ls");
		q.offer("pwd");
		q.offer("cd..");
		q.offer("mkdir");
		
		System.out.println();
		System.out.println("Commands: "+q);
		System.out.println("History limit: 3");
		
		System.out.println("--------------------------------");
		
		q.poll();
		System.out.println("Recent Commands: "+q);
		
		
	}
}