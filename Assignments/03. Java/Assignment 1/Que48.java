import java.util.Scanner;

class Que48{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int marks;
		System.out.print("\nEnter marks: ");
		marks=sc.nextInt();
		String grade;
		
		if(marks>=90 && marks<=100){
			grade="A+";
		} else if(marks>=85 && marks<90){
			grade="A";
		} else if(marks>=80 && marks<85){
			grade="A-";
		} else if(marks>=75 && marks<80){
			grade="B+";
		} else if(marks>=70 && marks<75){
			grade="B";
		} else if(marks>=65 && marks<70){
			grade="B-";
		} else if(marks>=60 && marks<65){
			grade="C+";
		} else if(marks>=55 && marks<60){
			grade="C";
		} else if(marks>=50 && marks<55){
			grade="C-";
		} else if(marks>=45 && marks<50){
			grade="D+";
		} else if(marks>=40 && marks<45){
			grade="D";
		} else if(marks>35 && marks<40){
		 	grade="E";
		} else{
			grade="F";}
		
		System.out.print("\nGrade: "+grade+"\n");
	}
}
