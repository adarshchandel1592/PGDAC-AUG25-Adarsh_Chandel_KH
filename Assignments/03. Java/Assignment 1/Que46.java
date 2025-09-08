import java.util.Scanner;

class Que46 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.print("\nAlphabet\n");
        } else if (ch >= '0' && ch <= '9') 
		{
            System.out.println("\nDigit\n");
        } else {
            System.out.println("\nSpecial Character\n");
        }
    }
}