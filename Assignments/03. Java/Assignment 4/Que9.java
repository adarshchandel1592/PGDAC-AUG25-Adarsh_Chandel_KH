import java.util.Scanner;

class Que9 {

    static void marksValidation(int marks) {
        try {
            if (marks >= 0 && marks <= 100) {
                System.out.println("Valid Marks");
            } else {
                throw new Exception("Invalid marks");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
        marksValidation(marks);
    }
}
