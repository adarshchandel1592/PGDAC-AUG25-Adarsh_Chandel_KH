import java.util.Scanner;

class Que16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		char letter;
		System.out.print("\nEnter a character: ");
		letter=sc.next().charAt(0);
		
		if((letter>='A' && letter<='Z') || (letter>='a' && letter<='z')){
			char lowerch=Character.toLowerCase(letter);
			
			if(lowerch == 'a' || lowerch == 'e' || lowerch == 'i' || lowerch == 'o' || lowerch=='u'){
			System.out.print("\nVowel\n");
			}
			
			else{
			System.out.print("\nConsonant\n");
			}
		
		}
		else{
			System.out.print("\nError. Invalid Input. Not an alphabet\n");
		}
	}
}