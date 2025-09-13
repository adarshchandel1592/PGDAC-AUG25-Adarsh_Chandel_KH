import java.util.*;

class Que17 {
    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("A");

        int count1 = 0; // for A
        int count2 = 0; // for B
        int count3 = 0; // for C 

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("A")) {
                count1++;
            } else if (list.get(i).equalsIgnoreCase("B")) {
                count2++;
            } else if (list.get(i).equalsIgnoreCase("C")){
                count3++;
            }
        }

        System.out.println("Grade Distribution: A=" + count1 + ", B=" + count2 + ", C=" + count3);
    }
}
