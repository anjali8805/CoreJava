package coreJava;

import java.util.Scanner;

public class SwapNumUsingTempVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter 1st number");
		int num1= scanner.nextInt();  //eg-20
		System.out.println("Enter 2st number");
		int num2= scanner.nextInt();  //eg-10
		int temp;
		temp=num1; //20
		num1=num2; //10
		num2=temp; // 20
		System.out.println( num1);
		System.out.println( num2);
	}

}
