import java.util.Scanner;

class Que50 {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in); //

        System.out.print("\nEnter number: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("\nDivisible by 2");
        } else {
            System.out.print("\nNot Divisible by 2");
        }

        if (num % 3 == 0) {
            System.out.print("\nDivisible by 3");
        } else {
            System.out.print("\nNot Divisible by 3");
        }

        if (num % 5 == 0) {
            System.out.print("\nDivisible by 5\n");
        } else {
            System.out.print("\nNot Divisible by 5\n");
        }
    }
}
