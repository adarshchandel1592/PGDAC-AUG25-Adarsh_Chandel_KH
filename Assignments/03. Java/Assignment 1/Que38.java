import java.util.Scanner;

class Que38{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		char ch, low_ch;
		System.out.print("\nEnter a character: ");
		ch = sc.next().charAt(0);
		
		low_ch = Character.toLowerCase(ch);
		
		String result = (low_ch == 'a' || low_ch == 'e' || low_ch == 'i' || low_ch == 'o' || low_ch == 'u') ? "\nVowel\n" : "\nConsonant\n";
		System.out.print(result);
	}
}