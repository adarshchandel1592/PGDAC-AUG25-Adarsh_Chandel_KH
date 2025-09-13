import java.util.*;

class Que21{
	public static void main(String args[]){
		
		Stack<String> stk = new Stack<>();
		stk.push("Type A");
		stk.push("Type B");
		stk.push("Delete");
		
		stk.pop();
		System.out.print("\nCurrent actions: "+stk);
		System.out.println();
	}
}