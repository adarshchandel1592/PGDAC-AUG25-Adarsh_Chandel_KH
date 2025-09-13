import java.util.*;

public class Que12 {
    public static void main(String[] args) {

        Map<String, Integer> mp = new TreeMap<>();
        mp.put("Amit", 90);
        mp.put("Rohan", 85);
        mp.put("Priya", 95);

        System.out.print("\nAttendance Report: ");

        for(Map.Entry<String, Integer> i : mp.entrySet()){
            System.out.print(i.getKey()+":"+i.getValue()+", ");
        }
    }
}
