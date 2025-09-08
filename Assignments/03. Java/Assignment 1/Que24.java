import java.util.Scanner;

class Que24{
	public static void main(String args[]){
		int marks, result;
		String grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter marks: ");
		marks=sc.nextInt();
		
		result = marks/10; //Converting to pointer system
		
		
		switch (result){
			case 10:
			case 9:
			case 8:
				if (marks>=85){
					System.out.print("\nGrade: A\n");
				}
				else{
					System.out.print("\nGrade: B\n");
				}
				break;
			case 7:
				System.out.print("\nGrade: B\n");
				break;
			case 6:
				System.out.print("\nGrade: C\n");
				break;
			case 5:
				if (marks>=55){
					System.out.print("\nGrade: C\n");
				}
				else{
					System.out.print("\nGrade: D\n");
				}
				break;
			case 4:
				if (marks>=45){
					System.out.print("\nGrade: D\n");
				}
				else{
					System.out.print("\nGrade: E\n");
				}
				break;
			case 3:
			case 2:
				if (marks>=25){
					System.out.print("\nGrade: E\n");
				}
				else{
					System.out.print("\nGrade: F\n");
				}
				break;
			case 1:
			case 0:
				System.out.print("\nGrade: F\n");
				break;	
			default:
				System.out.print("\nInvalid marks\n");
		}
	}
}