import java.util.Scanner;

public class Initialize{
	
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
}

class MenuDriven{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1. Grade Evaluation System\n2. Leap Year Check\n3. Day of the week\n4. Identify Default Value of Variables.");

		System.out.print("\nEnter your choice: ");
		int num = sc.nextInt();

		Initialize val = new Initialize();

		switch (num) {
			case 1:
				float mark_math = 78f;
				float mark_sci = 85f;
				float mark_hist = 91f;
				
				float avg_marks = (mark_math + mark_sci + mark_hist) / 3.0f;
				
				String grade = "";
				
				if (avg_marks >= 90) {
					grade = "A";
				} 
				else if (avg_marks >= 70 && avg_marks < 90) {
					grade = "B";
				} 
				else if (avg_marks >= 50 && avg_marks < 70) {
					grade = "C";
				} 
				else if (avg_marks >= 30 && avg_marks < 50) {
					grade = "D";
				} 
				else {
					grade = "FAIL";
				}
				System.out.println("\nYour choice is " + num + ". Grade Evaluation System");
				System.out.println("\nMarks in mathematics: " + mark_math);
				System.out.println("Marks in Science: " + mark_sci);
				System.out.println("Marks in History: " + mark_hist);
				System.out.println("\nAverage Marks: " + avg_marks);
				System.out.println("\nGrade obtained: " + grade);
				System.out.println();
				break;


			case 2:
				int year = 2022;
				System.out.println("\nYour choice is " + num + ". Checking Leap Year");
				if((year % 4 == 0 && year % 100!= 0) || (year % 400 == 0)){
					System.out.println("\n" + year + " is a leap year");
				}
				
				else{
					System.out.println("\n" + year + " is not a leap year");
				}
				System.out.println();
				break;

				
			case 3:
				int daynum = 5;
				System.out.println("\nYour choice is " + num + ". Checking Day of Week");
				switch(daynum){
					case 1:
						System.out.println("/nIt's Monday");
						break;
					case 2:
						System.out.println("/nIt's Tuesday");
						break;
					case 3:
						System.out.println("/nIt's Wednesday");
						break;
					case 4:
						System.out.println("/nIt's Thursday");
						break;
					case 5:
						System.out.println("/nIt's Friday");
						break;
					case 6:
						System.out.println("/nIt's Saturday");
						break;
					case 7:
						System.out.println("/nIt's Saturday");
						break;
					default:
						System.out.println("/nInvalid Day Number");
				}
				System.out.println();
				break;


			case 4:
				System.out.println("\nYour choice is " + num + ". Printing default values of variables.");
				System.out.println("\nByte a: " + val.a);
				System.out.println("Short b: " + val.b);
				System.out.println("Int c: " + val.c);
				System.out.println("Long d: " + val.d);
				System.out.println("Float e: " + val.e);
				System.out.println("Double f: " + val.f);
				System.out.println("Char g: " + val.g);
				System.out.println("Boolean h: " + val.h);
				System.out.println();
				break;



			default:
				System.out.println("\nWrong Input. Exiting\n");
				System.out.println();
				break;
		}
		sc.close();
	}
}

