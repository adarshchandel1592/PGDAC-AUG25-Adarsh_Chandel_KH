import java.util.Scanner;

class Que13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int total, class_attended;
		float percent;
		char med;
		
		System.out.print("\nClasses held: ");
		total=sc.nextInt();
		
		System.out.print("\nClasses attended: ");
		class_attended=sc.nextInt();
		
		System.out.print("\nMedical Cause (Y/N): ");
		med=sc.next().charAt(0);
		
		percent = ((float)class_attended/total)*100;
		
		if(percent>75 || (percent<=75 && (med == 'Y' || med == 'y'))){
			System.out.print("\nStudent is allowed to sit for the exam\n");
		}
		else{
			System.out.print("\nStudent is not allowed to sit for the exam");
		}
	}
}