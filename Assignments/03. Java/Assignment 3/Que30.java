// Notifyable Interface
interface Notifyable {
    void sendNotification(String message);
}

// Abstract LibraryMember Class
abstract class LibraryMember {
    protected String memberID, name;

    LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public abstract void borrowBook(int count);
}

// Book Class
class Book {
    private int bookID;
    private String title, author;

    Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// StudentMember Class
class StudentMember extends LibraryMember implements Notifyable {
    private int booksBorrowed = 0;
    private final int limit = 3;

    StudentMember(String memberID, String name) {
        super(memberID, name);
    }
	
    public void borrowBook(int count) {
        if (booksBorrowed + count > limit) {
            System.out.println("\nStudentMember " + name + " cannot borrow more than " + limit + " books.");
        } else {
            booksBorrowed += count;
            System.out.println("\nStudentMember " + name + " borrowed " + booksBorrowed + " books");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("\nNotification sent to " + name + ": " + message);
    }
}

// FacultyMember Class
class FacultyMember extends LibraryMember implements Notifyable {
    private int booksBorrowed = 0;
    private final int limit = 5;

    FacultyMember(String memberID, String name) {
        super(memberID, name);
    }

    @Override
    public void borrowBook(int count) {
        if (booksBorrowed + count > limit) {
            System.out.println("\nFacultyMember " + name + " cannot borrow more than " + limit + " books.");
        } else {
            booksBorrowed += count;
            System.out.println("FacultyMember " + name + " borrowed " + booksBorrowed + " books");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

// Main Class
public class Que30 {
    public static void main(String[] args) {
        // Create a student and a faculty
        StudentMember student = new StudentMember("S001", "Amit");
        FacultyMember faculty = new FacultyMember("F001", "Prof. Singh");

        // Borrow books
        student.borrowBook(2);
        faculty.borrowBook(4);

        // Send notifications
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
