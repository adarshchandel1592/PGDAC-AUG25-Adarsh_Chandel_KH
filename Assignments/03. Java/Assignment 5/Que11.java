
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Que11 {
    public static void main(String[] args) {
        
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Amit", 85);
        mp.put("Priya", 92);
        mp.put("Rohan", 85);

        System.out.print("\nGrade Report: ");
        Iterator<Map.Entry<String, Integer>> itr = mp.entrySet().iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"");
            if(itr.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
