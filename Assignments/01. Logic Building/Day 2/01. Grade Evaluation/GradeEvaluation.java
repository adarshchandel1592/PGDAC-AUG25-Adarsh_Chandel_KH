public class GradeEvaluation{
	public static void main(String[] args){
		
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
		
		System.out.println("Marks in mathematics: " + mark_math);
		System.out.println("Marks in Science: " + mark_sci);
		System.out.println("Marks in History: " + mark_hist);
		System.out.println("Average Marks: " + avg_marks);
		System.out.println("Grade obtained: " + grade);
	}
}