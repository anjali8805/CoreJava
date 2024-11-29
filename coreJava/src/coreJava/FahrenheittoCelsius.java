package coreJava;

import java.util.Scanner;

public class FahrenheittoCelsius {
 public static void main (String[]args) {
	 Scanner scanner = new Scanner (System.in);
	 System.out.println("enter temperarue in F");
	 
	 Float temp=scanner.nextFloat();
	 
	 float temperature= (5.0f/9.0f)* (temp-32);  
	 /*Convert to Celsius using floating-point division
	  the issue with integer division in the expression (5/9)—it will return 0 because both 5 and 9 are integers. 
	  To fix this, we should use floating-point division (5.0 / 9.0) to get the correct result.*/
	 System.out.println(" temperarue in C: " + " "+ temperature);
	 
 }
}