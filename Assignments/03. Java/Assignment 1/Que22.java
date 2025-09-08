import java.util.Scanner;

class Que22{
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter month number: ");
		num=sc.nextInt();
		
		String result = (num==1) ? "\nMonth is January\n" :
						(num==2) ? "\nMonth is Feburary\n" :
						(num==3) ? "\nMonth is March\n" :
						(num==4) ? "\nMonth is April\n" :
						(num==5) ? "\nMonth is May\n" :
						(num==6) ? "\nMonth is June\n" :
						(num==7) ? "\nMonth is July\n" :
						(num==8) ? "\nMonth is August\n" :
						(num==9) ? "\nMonth is September\n" :
						(num==10) ? "\nMonth is October\n" :
						(num==11) ? "\nMonth is November\n" :
						(num==12) ? "\nMonth is December\n" :
						"\nInvalid Input. Enter between (1-12)\n";
	System.out.print(result);
	}
}