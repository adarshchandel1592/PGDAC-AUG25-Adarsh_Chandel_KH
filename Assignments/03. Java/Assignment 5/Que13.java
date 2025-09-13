import java.util.*;

public class Que13 {
    public static void main(String[] args) {
        
        Map<String, Integer> mp = new LinkedHashMap<>();
        mp.put("Amit", 101);
        mp.put("Rohan", 102);
        mp.put("Priya", 103);
        System.out.print("\nRegistration Order: ");

        for (Map.Entry<String, Integer> en : mp.entrySet()) {
            System.out.print(en.getKey()+":"+en.getValue()+" ");
            
        }
    }

}    

