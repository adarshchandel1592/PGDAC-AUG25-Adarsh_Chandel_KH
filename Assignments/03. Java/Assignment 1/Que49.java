import java.util.Scanner;

class Que49 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int year, month, days;

        System.out.print("\nEnter year: ");
        year = sc.nextInt();

        System.out.print("\nEnter month number: ");
        month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("\nInvalid month number. Enter between 1 and 12.");
        } else if (month == 1 || month == 3 || month == 5 || 
					month == 7 || month == 8 || month == 10 || 
					month == 12) {
            days = 31;
            System.out.println("\nOutput:\n" + days+"\n");
        } else if (month == 4 || month == 6 || month == 9 || 
					month == 11) {
            days = 30;
            System.out.println("\nOutput:\n" + days+"\n");
        } else { // month == 2
            if ((year % 4 == 0 && year % 100 != 0) || 
					(year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
            System.out.println("\nOutput:\n" + days+"\n");
        }
    }
}
