package coreJava;

import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter 1st num"); 
	int num1 =scanner.nextInt();
	System.out.println("Enter 2st num"); 
	int num2 =scanner.nextInt();
	System.out.println(num1+num2);
	
}}
