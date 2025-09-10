import java.util.Scanner;

class Que4{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int[] arr = new int[a];
	
	for(int i=0; i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	
	int total_hours = sc.nextInt();
	int array_access = sc.nextInt();
	
	try{
		int salary = arr[array_access];
		
		try{
			salary = salary / total_hours;
			System.out.println("Hourly wage: "+salary);
		}catch(ArithmeticException e){
			System.out.println("Divison by zero");
		}
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Invalid index");
	}
}
}