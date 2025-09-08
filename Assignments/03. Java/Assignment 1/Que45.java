import java.util.Scanner;

class Que45 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("\nEnter three numbers (with space): ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3)
                System.out.print("\nAscending order: " + num3 + " " + num2 + " " + num1 + "\n");
            else
                System.out.print("\nAscending order: " + num2 + " " + num3 + " " + num1 + "\n");
        } 
        else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3)
                System.out.print("\nAscending order: " + num3 + " " + num1 + " " + num2 + "\n");
            else
                System.out.print("\nAscending order: " + num1 + " " + num3 + " " + num2 + "\n");
        } 
        else {
            if (num1 >= num2)
                System.out.print("\nAscending order: " + num2 + " " + num1 + " " + num3 + "\n");
            else
                System.out.print("\nAscending order: " + num1 + " " + num2 + " " + num3 + "\n");
        }
    }
}
