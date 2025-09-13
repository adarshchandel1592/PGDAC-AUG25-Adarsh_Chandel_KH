import java.util.HashSet;
import java.util.Set;

public class Que10 {
    public static void main(String[] args) {
        
        Set<Integer> s = new HashSet<>();
        s.add(201);
        s.add(202);
        s.add(203);
        s.add(202);

        System.out.println("\nTotal Voters: "+s.size());
    }
}
