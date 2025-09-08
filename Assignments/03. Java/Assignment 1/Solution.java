import java.io.*;
import java.util.*;

class Solution{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int max;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>=num2 && num1>=num3){
			max=num1;
			System.out.print("Maximum of "+num1+", "+num2+ ", and "+num3+" is: "+max);
		}
		
		else if(num2>=num1 && num2>=num3){
			max=num2;
			System.out.print("Maximum of "+num1+", "+num2+ ", and "+num3+" is: "+max);
		}
		else{
			max=num3;
			System.out.print("Maximum of "+num1+", "+num2+ ", and "+num3+" is: "+max);
		}
	}
}