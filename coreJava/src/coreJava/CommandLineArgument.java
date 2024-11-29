package coreJava;

public class CommandLineArgument {
public static void main (String[] args) {
	System.out.println(args.length);  // // Printing the number of command-line arguments
	for(int i=0; i<args.length;i++) {
		System.out.println("argument "+ i + " :"+ args[i]); // Iterating through the command-line arguments and printing each one
	}
	if (args.length==0) {
		System.out.println("No argument passed");   // Checking if no arguments were passed
	}
}

}
