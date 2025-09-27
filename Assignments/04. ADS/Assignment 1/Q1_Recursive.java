import java.util.Scanner;

public class Q1_Recursive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		
		int digits = countDigits(num);
		int sum = isArmstrong(num, digits);
		
		if(num == sum){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
       
    }
	
	static int countDigits(int num){
		if(num==0){
			return 0;
		}
		return 1+(countDigits(num/10));
	}
	
	static int isArmstrong(int num, int digits){
		if(num==0){
			return 0;
		}
		
		int digit = num%10;
		int power = 1;
		
		for(int i=0; i<digits; i++){
			power *= digit;
		}
		
		return power + isArmstrong(num/10, digits);
	}
}
