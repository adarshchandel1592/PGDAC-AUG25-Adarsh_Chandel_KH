import java.util.Scanner;

class TemperatureSensor{
	private int temperature;
	
	public int getTemp(){
		return temperature;
	}
	
	public int setTemp(int temp){
		if(temp>=0 && temp<= 100){
			this.temperature = temp;
		}
		else{
			System.out.print("\nTemperature out of range.");
		}
		return temp;
	}
}

class Que5{
	public static void main(String args[]){
		
		TemperatureSensor t = new TemperatureSensor();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\ntemperature = ");
		int temp = sc.nextInt();
		
		t.setTemp(temp);

        if (temp >= 0 && temp <= 100){
            System.out.println("\n\nValid Temperatue\nEntered Temperature is: " + t.getTemp());
        }
		System.out.println();
	}
}
