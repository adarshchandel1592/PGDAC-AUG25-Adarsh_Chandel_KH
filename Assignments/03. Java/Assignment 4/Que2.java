import java.util.Scanner;

class Que2{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		try{
			System.out.println(arr[b]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index accessed");
		}
		
	}
}