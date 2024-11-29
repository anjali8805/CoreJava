package coreJava;

public class MaxElement_2ndMaxElementinArray {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};

        // Check for edge case if array has less than 2 elements
        if (arr.length < 2) {
            System.out.println("Array does not have enough elements.");
            return;
        }

        // Initialize max1 and max2 as the first two elements
        int max1, max2;

        if (arr[0] > arr[1]) {
            max1 = arr[0];  // First element is the max
            max2 = arr[1];  // Second element is the second max
        } else {
            max1 = arr[1];  // Second element is the max
            max2 = arr[0];  // First element is the second max
        }

        // Iterate through the array starting from the 3rd element
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;  // Update second max
                max1 = arr[i];  // Update max
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];  // Update second max
            }
        }

        // Print the results
        System.out.println("Maximum element: " + max1);
        System.out.println("Second maximum element: " + max2);
	}

}
