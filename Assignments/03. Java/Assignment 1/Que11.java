import java.util.Scanner;

class Que11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.print("\nEnter percentage marks: ");
		marks=sc.nextInt();
		
		String grade;
		
		if(marks>=90){
			grade="A+";
		}
		else if(marks>75 && marks<90){
			grade="A";
		}
		else if(marks>65 && marks<76){
			grade="B+";
		}
		else if(marks>50 && marks <66){
			grade="B";
		}
		else if(marks>35 && marks<51){
			grade="C";
		}
		else{
			grade="Fail";
		}
		
		System.out.print("\nGrade: " + grade + "\n");
		}
	}