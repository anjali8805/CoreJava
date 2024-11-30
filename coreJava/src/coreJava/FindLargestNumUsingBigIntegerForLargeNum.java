package coreJava;

import java.math.BigInteger;
import java.util.Scanner;

public class FindLargestNumUsingBigIntegerForLargeNum {

	public static void main(String[] args) {
	Scanner largeNum= new Scanner(System.in);
	System.out.println("1st number");
	String num1= largeNum.nextLine();
	System.out.println("2st number");
	String num2= largeNum.nextLine();
	
	BigInteger largeNum1= new BigInteger(num1);  //The BigInteger constructor takes a String that represents the number.
	BigInteger largeNum2= new BigInteger(num2);  
	/*If the number you want to convert to BigInteger is a primitive type (like int or long), you need to 
	 * convert it to a string before passing it to the BigInteger constructor.String.valueOf(num) is a method that 
	 * converts any number (int, long, etc.) into a String.
	 */
	BigInteger largest=largeNum1.compareTo(largeNum2)> 0 ? largeNum1 : largeNum2;  //we are using ternary operator here.
	
	
	 //If the result is 0: This means both BigInteger objects are equal.
	 //If the result is a positive number (greater than 0): This means the first BigInteger (num1) is greater than the second (num2).
	// If the result is a negative number (less than 0): This means the first BigInteger (num1) is less than the second (num2).
	 
        /* if-else statement
         if (num1.compareTo(num2) > 0) {
          BigInteger largest = largeNum1;
        } else {
          BigInteger largest = largeNum2;
        } */
	 
	System.out.println("Largest Number : "+ largest);
	}

}
