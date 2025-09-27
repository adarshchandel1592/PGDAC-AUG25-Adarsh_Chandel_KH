import java.util.Scanner;

class Q4_Iterative{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
        int a = 0;
        int b = 1;

		
		if(number<0){
            System.out.println("Enter a positive number");
		}
        else{
            for (int i = 1; i <=number; i++) {
                System.out.print(a+ " ");

                int next = a+b;
                a = b;
                b = next;
            }
        }
	}
}