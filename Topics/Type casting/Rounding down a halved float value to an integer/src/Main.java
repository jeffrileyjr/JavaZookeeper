import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Create Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		// Read float value from user and assign it to floatVariable
		float floatVariable = scanner.nextFloat();

		// Divide the float variable by 2 and round down the result
		int result = (int) floatVariable / 2;
		// The result should be of integer type

		// Print the integer result
		System.out.println(result);

		// Close the Scanner
		scanner.close();
	}
}