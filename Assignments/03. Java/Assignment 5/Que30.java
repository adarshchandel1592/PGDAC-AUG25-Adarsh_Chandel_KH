import java.util.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
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
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "C"));
        students.add(new Student("Rohan", "B"));

        // Create a new Map, for this, mostly converting grade to number
        Map<String, Integer> grade = new HashMap<>();
        grade.put("A", 4);
        grade.put("B", 3);
        grade.put("C", 2);
        grade.put("D", 1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Filter: Grade >= ");
        String filter = sc.nextLine().trim().toUpperCase();

        int threshold = grade.get(filter);

        // Filter students
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (grade.get(s.grade) < threshold) {
                itr.remove();
            }
        }

        // Display qualified students
        System.out.print("\nQualified Students: ");
        for (Object s : students) {
            System.out.print(s+" ");
        }
    }
}
