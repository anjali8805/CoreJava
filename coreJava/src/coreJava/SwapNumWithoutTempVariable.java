package coreJava;

import java.util.Scanner;

public class SwapNumWithoutTempVariable {
public static void main(String[]args) {
 Scanner scanner= new Scanner(System.in);
 System.out.println("Enter num1 ");
 int num1 = scanner.nextInt();  //20
 System.out.println("Enter num2");
 int num2 = scanner.nextInt();  //30
 
 num1= num1 - num2; // 20-30=-10
 num2=num1+num2; //-10+30=20
 num1= num2-num1; // 20-(-10)=30
 System.out.println("num1: "+ num1+" " + "num2: "+ num2);
 
}}
