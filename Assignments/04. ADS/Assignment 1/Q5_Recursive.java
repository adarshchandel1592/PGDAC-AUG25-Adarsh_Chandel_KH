import java.util.Scanner;

public class Q5_Recursive {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = (num1 < num2) ? num1 : num2;

        int gcd = findGCD(num1, num2, min);

        System.out.println(gcd);
    }

    static int findGCD(int num1, int num2, int min){
        if(min==0){
            return 1;
        }

        if(num1%min==0 && num2%min==0){
            return min;
        }

        return findGCD(num1, num2, min-1);
    }
}
