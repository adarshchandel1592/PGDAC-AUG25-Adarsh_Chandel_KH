import java.util.*;

public class Q10_Recursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(isLeapYear(year, 0)){
            System.out.println("True");
        }
        else
            System.out.println("False");

    }

    static boolean isLeapYear(int year, int step){
        if(step ==0){
            if (year%400==0){
                return true;
            }
            return isLeapYear(year, step+1);
        } else if (step == 1) {
            if(year%100==0){
                return false;
            }
            return isLeapYear(year, step+1);
        } else if (step == 2) {
            if (year%4==0){
                return true;
            }
            return false;
        }
        return false;
    }
}
