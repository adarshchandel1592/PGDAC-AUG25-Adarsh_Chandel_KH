import java.util.Scanner;

class Student {
    private double marks;

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.print("\nEnter marks in the range (0–100)");
        }
    }
}

class Que2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("\nEnter marks: ");
        double marks = sc.nextDouble();
        
        s.setMarks(marks);
        System.out.print("\nMarks = " + s.getMarks());
		System.out.println();
    }
}
