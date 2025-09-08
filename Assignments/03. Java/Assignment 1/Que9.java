import java.util.Scanner;

class Que9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int salary, years_serv;
		System.out.print("\nEnter salary: ");
		salary=sc.nextInt();
		
		System.out.print("\nEnter years of service: ");
		years_serv=sc.nextInt();
		
		String result = (years_serv>5) ? "\nBonus amount:" + (int)(salary*0.05) + "\n" : "\nYou are not eligible for bonus\n";
		System.out.print(result);
	}
}