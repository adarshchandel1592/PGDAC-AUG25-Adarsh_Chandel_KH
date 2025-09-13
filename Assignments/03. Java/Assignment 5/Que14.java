import java.util.*;

public class Que14 {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
		
		mp.put("Rohan", 78);
		mp.put("Arsh", 82);
		mp.put("Manish", 61);
		mp.put("Shaurya", 98);
		
		mp.replace("Rohan", 88);
		
		System.out.println(mp);
    }
}
