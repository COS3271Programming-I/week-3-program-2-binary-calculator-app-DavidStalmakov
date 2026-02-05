package projectdavid;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        // Read binary numbers as strings
        System.out.print("Enter first binary number (x): ");
        String xBinary = input.nextLine();

        System.out.print("Enter second binary number (y): ");
        String yBinary = input.nextLine();

        // Convert binary strings to integers
        int x = Integer.parseInt(xBinary, 2);
        int y = Integer.parseInt(yBinary, 2);

        // Perform calculations
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;   // integer division

        // Print results in binary
        System.out.println("\nResults (in binary):");
        System.out.println("x + y = " + Integer.toBinaryString(sum));
        System.out.println("x - y = " + Integer.toBinaryString(difference));
        System.out.println("x * y = " + Integer.toBinaryString(product));
        System.out.println("x / y = " + Integer.toBinaryString(quotient));

        input.close();
    }
}
        



