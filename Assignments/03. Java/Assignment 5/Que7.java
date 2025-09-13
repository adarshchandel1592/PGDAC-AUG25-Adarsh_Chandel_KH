
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Que7 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Rohan");
        list.add("Amit");
        list.add("Priya");

        Collections.sort(list);
        System.out.println("\nStudents: "+list);
    }
}
