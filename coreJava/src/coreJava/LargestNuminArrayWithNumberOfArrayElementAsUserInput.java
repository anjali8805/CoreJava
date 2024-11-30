package coreJava;

import java.util.Scanner;

public class LargestNuminArrayWithNumberOfArrayElementAsUserInput {
	public static void main(String[] args) {
		Scanner element= new Scanner(System.in);
		// Ask for the array size
		System.out.println("Enter the number of elements in array");
		int numOfElement=element.nextInt();
		// Create the array dynamically based on user input
		int[]arr= new int[numOfElement];
		
		// Take input for each element in array
		System.out.println("Enter " + numOfElement + " elements:");
		for(int i=0; i<numOfElement;i++) {
			arr[i]= element.nextInt();
		}
		// Print the array elements
		  System.out.println("The array elements are:");
		  for(int i=0; i<arr.length;i++) {
			  System.out.println("element at " + i +" "+arr[i] );
	}
		//largestElement
		  int maximum=arr[0]; //assume the first element as largest.
		  for(int i=1; i<arr.length; i++) {
			  if(maximum>arr[i]) {
				  maximum= maximum;
			  }
			  else {
				  maximum=arr[i];
			  }
		  }
		  System.out.println("maximum element " +" "+maximum );
}
}