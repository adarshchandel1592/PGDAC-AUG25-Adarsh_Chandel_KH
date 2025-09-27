import java.util.Scanner;

public class Q1_Iterative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count_digits = 0;
        int temp = 0;
        int sum = 0;
        int num = sc.nextInt();
        
        // Count the number of digits in the number
        temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count_digits++;
        }
        
        temp = num;
        // Iterate over each digit of the number
        while (temp > 0) {
            int digit = temp % 10;
            int result = 1;  // Initialize result to 1 for each digit
            
            // Raise the digit to the power of count_digits manually
            for (int i = 0; i < count_digits; i++) {
                result *= digit;  // Multiply `result` by `digit` count_digits times
            }
            
            sum += result;  // Add the result to the sum
            temp /= 10;  // Remove the last digit
        }
        
        // Check if the sum equals the original number (Armstrong condition)
        if (sum == num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
