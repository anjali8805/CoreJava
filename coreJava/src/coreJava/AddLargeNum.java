package coreJava;

import java.math.BigInteger;
import java.util.Scanner;

public class AddLargeNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter 1st number");
		String num1= scanner.nextLine();
		
		System.out.println("Enter 2nd number");
		String num2= scanner.nextLine();
		
		/*num1, num2: These strings store the large numbers entered by the user. 
		Strings are used because these numbers might be too large to be stored in standard numeric types.
		*/
		
		BigInteger largeNum1= new BigInteger(num1);
		BigInteger largeNum2= new BigInteger(num2);
		
		BigInteger sum= largeNum1.add(largeNum2);
		System.out.println(sum);
	}

}
