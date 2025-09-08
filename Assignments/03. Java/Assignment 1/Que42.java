import java.util.Scanner;
class Que42{
	public static void main(String args[]){
		int result, units, tens, hundreds;
		
		for (int i=100; i<=500; i++){
			units=i%10;
			tens=(i/10)%10;
			hundreds=i/100;
		
			result = (units*units*units) + (tens*tens*tens) + (hundreds*hundreds*hundreds);
		
			if(result==i){
				System.out.print("\n" +i+ "\n");
			}
		}		
	}
}