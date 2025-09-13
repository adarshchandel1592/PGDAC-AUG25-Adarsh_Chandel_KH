
import java.util.*;

public class Que9 {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("Amit");
        s.add("Rohan");
        s.add("Amit");
        s.add("Priya");

        System.out.println("\nTotal unique attendees: "+s.size());
    }
}
