import java.util.Scanner;

class Que28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String light;
		System.out.print("\nEnter traffic light color: ");
		light=sc.nextLine();
		
		String low_light = light.toLowerCase();
		switch(low_light){
			case "green":
				System.out.println("\nGO\n");
				break;
				
			case "yellow":
				System.out.print("\nWait\n");
				break;
			case "red":
				System.out.print("\nStop\n");
				break;
			default:
				System.out.print("\nInvalid input\n");
		}
	}
}