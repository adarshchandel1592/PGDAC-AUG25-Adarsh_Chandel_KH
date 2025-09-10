import java.io.*;
import java.util.Scanner;

class Que7{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String filename = sc.nextLine();
		try{
			File f = new File(filename);
			FileReader fr = new FileReader(f);
			fr.close();
		}catch(IOException e){
			System.out.println("File not Found");
		}
	}
}                          