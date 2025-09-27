import java.util.*;

public class Q4_Recursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int num){
        if (num==0)
            return 0;
        if (num==1)
            return 1;

        return fibonacci(num-1) + fibonacci(num-2);

    }
}
