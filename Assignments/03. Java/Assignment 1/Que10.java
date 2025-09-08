import java.util.Scanner;

class Que10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int total, class_attended;
		System.out.print("\nEnter total classes held: ");
		total=sc.nextInt();
		
		System.out.print("\nEnter classes attended: ");
		class_attended=sc.nextInt();
		
		String result = ((((double)class_attended/total)*100)>75) ? "\nStudent is allowed to sit for exam\n" : "\nStudent is not allowed to sit for exam\n";
		System.out.print(result);	
	}
}