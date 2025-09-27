import java.util.*;

public class Q2_Iterative{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Method 1: By Iteration
        System.out.println();
        int num = sc.nextInt();
        int count = 0;

        if (num < 0) {
            System.out.println("Enter a positive number");
        } else if (num == 0 || num == 1) {
            System.out.println("false"); // 0 and 1 are NOT composite
        } else {
            // Count divisors
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("true"); // Prime
            } else {
                System.out.println("false"); // Composite
            }
        }

    }
}