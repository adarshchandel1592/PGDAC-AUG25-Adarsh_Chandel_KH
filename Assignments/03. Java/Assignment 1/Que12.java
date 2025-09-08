import java.util.Scanner;

class Que12{
	public static void main(String args[]){
		int age1, age2, age3;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("\nEnter age of Friend 1: ");
		age1=sc.nextInt();
		System.out.print("\nEnter age of Friend 2: ");
		age2=sc.nextInt();
		System.out.print("\nEnter age of Friend 3: ");
		age3=sc.nextInt();
		
		if(age1>=age2 && age1>=age3){
			System.out.print("\nOldest: Friend 1\n");
		}
		
		else if(age2>=age1 && age2>=age3){
			System.out.print("\nOldest: Friend 2\n");
		}
		else{
			System.out.print("\nOldest: Friend 3\n");
		}
		
		
		if(age1<=age2 && age1<=age3){
			System.out.print("\nYoungest: Friend 1\n");
		}
		
		else if(age2<=age1 && age2<=age3){
			System.out.print("\nYoungest: Friend 2\n");
		}
		else{
			System.out.print("\nYoungest: Friend 3\n");
		}
		
		}
	}
