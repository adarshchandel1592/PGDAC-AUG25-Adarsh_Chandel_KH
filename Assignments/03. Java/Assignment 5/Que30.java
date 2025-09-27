import java.util.*;

class Student {
    String name;
    char grade;

    Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ":" + grade;
    }
}

class Que30 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", 'A'));
        students.add(new Student("Priya", 'C'));
        students.add(new Student("Rohan", 'B'));

        Scanner sc = new Scanner(System.in);
        System.out.print("Filter: Grade >= ");
        char filter = sc.nextLine().trim().toUpperCase().charAt(0);

        // Filter students
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.grade > filter) {  // If grade is lexicographically greater, it means lower grade
                itr.remove();
            }
        }

        // Display qualified students
        System.out.print("\nQualified Students: ");
        for (Student s : students) {
            System.out.print(s + " ");
        }
    }
}
