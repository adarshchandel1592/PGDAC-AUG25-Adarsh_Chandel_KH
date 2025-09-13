import java.util.*;

class Que23{
	public static void main(String args[]){
		
		Stack<String> q = new Stack<>();
		q.push("Google");
		q.push("Youtube");
		q.push("GFG");
		q.pop();
		
		System.out.println("Current history: "+q);
	}
}